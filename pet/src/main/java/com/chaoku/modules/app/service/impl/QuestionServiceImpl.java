package com.chaoku.modules.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Query;
import com.chaoku.common.utils.Result;
import com.chaoku.modules.app.dao.QuestionDao;
import com.chaoku.modules.app.dto.question.QuestionDto;
import com.chaoku.modules.app.entity.QuestionEntity;
import com.chaoku.modules.app.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, QuestionEntity> implements QuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuestionEntity> page = this.page(
                new Query<QuestionEntity>().getPage(params),
                new QueryWrapper<QuestionEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 获取问题
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/11/1
     */
    @Override
    public Result getQuestion(QuestionDto questionDto) {



        return null;
    }

}