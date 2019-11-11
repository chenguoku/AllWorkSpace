package com.chaoku.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chaoku.common.utils.PageUtils;
import com.chaoku.common.utils.Result;
import com.chaoku.modules.app.dto.question.QuestionConfirmDto;
import com.chaoku.modules.app.dto.question.QuestionDto;
import com.chaoku.modules.app.entity.QuestionEntity;

import java.util.Map;

/**
 * 问题表
 *
 * @author chenguoku
 * @email cgkhh1996@163.com
 * @date 2019-11-01 00:18:47
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    Result getQuestion(QuestionDto questionDto);

    Result submitQuestion(QuestionConfirmDto dto);
}

