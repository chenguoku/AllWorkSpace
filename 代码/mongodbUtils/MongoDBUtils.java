package com.leimingtech.modules.utils;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONArray;
import com.leimingtech.modules.dto.PageModelDto;
import com.leimingtech.modules.dto.RangConditionDto;
import com.leimingtech.modules.dto.RangConditionsToTimeModelDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @Author: wangxiaogang
 * @Email: wang_xiaogang17@163.com
 * @Date: 2019/7/25 14:02
 * @Description:
 */
@Slf4j
@Component
public class MongoDBUtils {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * mongo保存数据
     * @param tableName  表名称
     * @param baseEntity  存储实体
     * @return
     */
    public <T> Boolean saveData(String tableName, T baseEntity) {
        try{
            mongoTemplate.save(baseEntity, tableName);
            return true;
        }catch (Exception e){
            log.error("mongo保存数据异常",e);
            return false;
        }
    }

    /**
     * mongo保存数据-批量
     * @param tableName  表名
     * @param baseEntitysJson  存储实体集合
     * @return
     */
    public Boolean saveDataBatch(String tableName, String baseEntitysJson) {
        try{
            List<Map> baseEntityList = JSONArray.parseArray(baseEntitysJson, Map.class);
            for(Map<String,Object> baseEntity : baseEntityList){
                mongoTemplate.save(baseEntity, tableName);
            }
            return true;
        }catch (Exception e){
            log.error("mongo批量保存数据异常",e);
            return false;
        }

    }

    /**
     * mongo更新数据--根据ID更新
     * @param tableName  表名
     * @param fieldName 更新识别字段
     * @param paramters 更新参数
     * @return
     */
    public Boolean updateData(String tableName,String fieldName,Map<String, Object> paramters) {
        try{
            Query query = new Query(Criteria.where(fieldName).is(paramters.get(fieldName)));
            Update update = new Update();
            for (String keyParamters : paramters.keySet()) {
                if (!keyParamters.equals("_id")) {
                    update.set(keyParamters, paramters.get(keyParamters));
                }
            }
            mongoTemplate.updateFirst(query, update, tableName);
            return true;
        }catch (Exception e){
            log.error("mongo更新数据异常",e);
            return false;
        }
    }

    /**
     * 批量更新mongodb数据
     * @param tableName  表名
     * @param fieldName 更新识别字段
     * @param updateEntitysJson 更新map集合
     */
    public void updateDataMuti(String tableName,String fieldName,String updateEntitysJson) {
        try{
            List<Map> paramtersList= JSONArray.parseArray(updateEntitysJson, Map.class);
            for (Map<String, Object> paramters : paramtersList){

                Query query = new Query(Criteria.where(fieldName).is(paramters.get(fieldName)));
                Update update = new Update();
                for (String keyParamters : paramters.keySet()) {
                    if (!keyParamters.equals("_id")) {
                        update.set(keyParamters, paramters.get(keyParamters));
                    }
                }
                mongoTemplate.updateMulti(query, update, tableName);
            }
        }catch (Exception e){
            log.error("批量更新mongo数据异常",e);
        }
    }

    /**
     * mongo删除数据--根据主键删除
     * @param tableName  表名
     * @param primaryKeyValue 匹配值
     * @return
     */
    public Boolean deleteDataByPrimaryKey(String tableName,Object primaryKeyValue) {
        try {
            Query query = new Query(Criteria.where("_id").is(primaryKeyValue));
            Update update = new Update();
            update.set("isDel",1);
            mongoTemplate.updateFirst(query, update, tableName);
            return true;
        }catch (Exception e){
            log.error("mongo删除数据异常",e);
            return false;
        }
    }

    /**
     * 物理清空表数据
     * @param tableName  表名
     * @return
     */
    public Boolean physicalDeleteAll(String tableName) {
        try {
            Query query = new Query();
            mongoTemplate.remove(query,tableName);
            return true;
        }catch (Exception e){
            log.error("mongo清空表数据异常",e);
            return false;
        }
    }

    /**
     * mongo查询数据--根据主键
     * @param tableName 表名
     * @param primaryKeyValue 匹配值
     * @return
     */
    public Map<String,Object> getDataByPrimaryKey(String tableName,Object primaryKeyValue){
        try{
            Query query = new Query(Criteria.where("_id").is(primaryKeyValue));
            return mongoTemplate.findOne(query, Map.class, tableName);
        }catch (Exception e){
            log.error("mongo查询数据异常",e);
            return null;
        }
    }

    /**
     * 分页查询数据
     * @param tableName  表名
     * @param pageModel  分页实体
     * @return
     */
    public PageModelDto getDataByParamters(String tableName,PageModelDto pageModel) {
        try{
            Query query = getQuery(pageModel);
            Long totalCount = mongoTemplate.count(query, tableName);
            pageModel.setTotal(totalCount);
            if (pageModel.getIsPage()) {
                // 分页
                int pageStart = 0;
                int pageSize = 10000;
                pageSize = pageModel.getPageSize();
                pageStart = (pageModel.getPageNum() - 1) * pageSize;
                // 查询起始值
                query.skip(pageStart);
                // 查询大小
                query.limit(pageSize);
            }

            for (String sortKey : pageModel.getSortFileds().keySet()) {
                if ("asc".equals(pageModel.getSortFileds(sortKey))) {
                    query.with(new Sort(new Sort.Order(Sort.Direction.ASC, sortKey)));
                } else if ("desc".equals(pageModel.getSortFileds(sortKey))) {
                    query.with(new Sort(new Sort.Order(Sort.Direction.DESC, sortKey)));
                }
            }

            log.info("mongo_query:{}", query);

            List<Map> result = mongoTemplate.find(query, Map.class, tableName);
            for (Map map : result) {
                String json = JSONUtil.toJsonStr(map);
                pageModel.setJsonRsList(json);
            }
            return pageModel;
        }catch (Exception e){
            log.error("mongo分页查询数据异常",e);
            return null;
        }
    }

    /**
     * 查询分页总数
     * @param tableName 表名
     * @param pageModel 分页实体
     * @return
     */
    public Long getCount(String tableName,PageModelDto pageModel) {
        try{
            Query query = getQuery(pageModel);
            Long totalCount = mongoTemplate.count(query, tableName);
            return totalCount;
        }catch (Exception e){
            log.error("查询分页总数异常",e);
            return null;
        }
    }

    /**
     * 接接查询条件
     *
     * @param pageModel
     * @return
     */
    private Query getQuery(PageModelDto pageModel) {
        Query query = new Query();
        Criteria criteria = new Criteria();
        //查询未删除数据
        criteria.and("isDel").is(0);
        // 精确查询 and
        for (String key : pageModel.getEqualsSearchCondition().keySet()) {
            Object machValue = pageModel.getEqualsSearchCondition().get(key);
            if (null != machValue) {
                criteria.and(key).is(machValue);
            }
        }

        // in 查询 and
        Map<String, List> inSearchCondition = pageModel.getInSearchCondition();
        Integer inSearchConditionSize = inSearchCondition.size();
        if(inSearchConditionSize>0){
            for (String key : inSearchCondition.keySet()) {
                Object machValue = pageModel.getInSearchCondition().get(key);
                if (null != machValue) {
                    criteria.and(key).in((List)machValue);
                }
            }
        }

        // 模糊匹配查询 and
        Map<String, Object> likeSearchCondition = pageModel.getLikeSearchCondition();
        Integer likeSearchConditionSize = likeSearchCondition.size();
        if (likeSearchConditionSize > 0) {
            Criteria[] LikeCriterias = new Criteria[likeSearchConditionSize];
            Integer likeCriteriasCount = 0;
            for (String key : likeSearchCondition.keySet()) {
                Object machValue = pageModel.getLikeSearchCondition().get(key);
                if (null != machValue) {
                    Pattern pattern = Pattern.compile("^.*" + machValue + ".*$", Pattern.CASE_INSENSITIVE);
                    LikeCriterias[likeCriteriasCount] = Criteria.where(key).regex(pattern);
                    likeCriteriasCount++;
                }
            }
            criteria.andOperator(LikeCriterias);
        }

        // 时间区间查询 and long类型的比较
        Map<String, RangConditionsToTimeModelDto> rangConditionsTimemodel = pageModel.getRangConditionsToTimeModelMap();
        Integer rangConditionsTimeModelSize = rangConditionsTimemodel.size();
        if (rangConditionsTimeModelSize > 0) {
            Criteria[] rangCriterias = new Criteria[rangConditionsTimeModelSize];
            Integer rangCriteriasCount = 0;
            for (String key : rangConditionsTimemodel.keySet()) {
                RangConditionsToTimeModelDto rangConditionsToTimeModelMap = rangConditionsTimemodel.get(key);
                Timestamp startTime = rangConditionsToTimeModelMap.getBeginTime();
                Timestamp endTime = rangConditionsToTimeModelMap.getEndTime();
                rangCriterias[rangCriteriasCount] = Criteria.where(key).gte(startTime.getTime()).lte(endTime.getTime());
                rangCriteriasCount++;
            }
            criteria.andOperator(rangCriterias);
        }

        // 其他数据区间查询
        Map<String, RangConditionDto> rangConditionMaps = pageModel.getRangConditionMap();
        Integer rangConditionMapSize = rangConditionMaps.size();
        if (rangConditionMapSize > 0) {
            Criteria[] rangConditionMapCriterias = new Criteria[rangConditionMapSize];
            Integer rangConditionMapCriteriasCount = 0;
            for (String key : rangConditionMaps.keySet()) {
                RangConditionDto rangConditionMap = rangConditionMaps.get(key);
                rangConditionMapCriterias[rangConditionMapCriteriasCount] = Criteria.where(key).gte(rangConditionMap.getBeginValue()).lte(rangConditionMap.getEndValue());
                rangConditionMapCriteriasCount++;
            }
            criteria.andOperator(rangConditionMapCriterias);
        }

        // or equals 拼接查询
        Map<String, Object> orSearchCondition = pageModel.getOrSearchCondition();
        Integer orSearchConditionSize = orSearchCondition.size();
        if (orSearchConditionSize > 0) {
            Criteria[] orSearchConditionCriteria = new Criteria[orSearchConditionSize];
            Integer orSearchConditionCriteriaCount = 0;
            for (String key : orSearchCondition.keySet()) {
                Object value = orSearchCondition.get(key);
                if (null != value) {
                    orSearchConditionCriteria[orSearchConditionCriteriaCount] = Criteria.where(key).is(value);
                    orSearchConditionCriteriaCount++;
                }
            }
            criteria.orOperator(orSearchConditionCriteria);
        }

        // or like 拼接查询
        Map<String, Object> orLikeSearchCondition = pageModel.getOrLikeSearchCondition();
        Integer orLikeSearchConditionSize = orLikeSearchCondition.size();
        if (orLikeSearchConditionSize > 0) {
            Criteria[] orLikeSearchConditionCriteria = new Criteria[orLikeSearchConditionSize];
            Integer orLikeSearchConditionCriteriaCount = 0;
            for (String key : orLikeSearchCondition.keySet()) {
                Object value = orLikeSearchCondition.get(key);
                if (null != value) {
                    Pattern pattern = Pattern.compile("^.*" + value + ".*$", Pattern.CASE_INSENSITIVE);
                    orLikeSearchConditionCriteria[orLikeSearchConditionCriteriaCount] = Criteria.where(key).regex(pattern);
                    orLikeSearchConditionCriteriaCount++;
                }
            }
            criteria.orOperator(orLikeSearchConditionCriteria);
        }

        query.addCriteria(criteria);
        return query;
    }

}

