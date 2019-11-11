package com.chaoku.modules.app.controller.question;

import com.chaoku.common.utils.Result;
import com.chaoku.modules.app.dto.question.QuestionConfirmDto;
import com.chaoku.modules.app.dto.question.QuestionDto;
import com.chaoku.modules.app.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName QuestionController.java
 * @Description 问题Controller
 * @createTime 2019年11月01日 00:27:00
 */
@RestController
@RequestMapping("question")
@Api(value = "QuestionController", tags = "问题")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("learn")
    @ApiOperation("获取学习的问题")
    public Result getQuestion(@RequestBody QuestionDto dto) {
        Result result = questionService.getQuestion(dto);
        return result;
    }

    @PostMapping("learn/submit")
    @ApiOperation("提交问题的答案")
    public Result submitQuestion(@RequestBody QuestionConfirmDto dto) {
        if (!dto.getRight()){
            return new Result().error("回答错误！");
        }
        Result result = questionService.submitQuestion(dto);
        return result;
    }

}
