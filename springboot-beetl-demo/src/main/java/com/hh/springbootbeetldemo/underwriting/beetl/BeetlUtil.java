package com.hh.springbootbeetldemo.underwriting.beetl;

import com.alibaba.fastjson.JSON;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Classname: BeetlUtil
 * @Description: BeetlUtil
 * @Author: chenguoku
 * @Date 2020-11-9
 * @Version V1.0
 */
@Component
public class BeetlUtil {

    @Autowired
    private BeetlGroupUtilConfiguration beetlGroupUtilConfiguration;

    public String getBeetlString(String templatePath, Object params) {
        GroupTemplate groupTemplate = beetlGroupUtilConfiguration.getGroupTemplate();
        Template template = groupTemplate.getTemplate(templatePath);
        template.binding("p", JSON.parseObject(JSON.toJSONString(params), Map.class));
        return template.render();
    }

}
