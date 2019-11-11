package com.chaoku.modules.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chaoku.common.utils.*;
import com.chaoku.modules.app.dao.QuestionDao;
import com.chaoku.modules.app.dto.question.QuestionConfirmDto;
import com.chaoku.modules.app.dto.question.QuestionDto;
import com.chaoku.modules.app.entity.QuestionEntity;
import com.chaoku.modules.app.entity.UserEntity;
import com.chaoku.modules.app.entity.UserPetEntity;
import com.chaoku.modules.app.service.QuestionService;
import com.chaoku.modules.app.service.UserPetService;
import com.chaoku.modules.app.service.UserService;
import com.chaoku.modules.app.vo.question.QuestionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, QuestionEntity> implements QuestionService {

    @Autowired
    private UserService userService;

    @Autowired
    private QuestionDao questionDao;

    @Autowired
    private UserPetService userPetService;

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
    public Result getQuestion(QuestionDto dto) {

        UserEntity user = userService.getById(dto.getUserId());
        Integer questionLimit = user.getQuestionLimit();
        List<QuestionEntity> randomQuestion = questionDao.getRandomQuestion(questionLimit);
        List<QuestionVo> questionVos = ConvertUtils.sourceToTarget(randomQuestion, QuestionVo.class);

        return new Result().ok(questionVos);
    }

    @Override
    @Transactional
    public Result submitQuestion(QuestionConfirmDto dto) {
        UserEntity user = userService.getById(dto.getUserId());
        UserPetEntity userPetEntity = userPetService.selectByUserId(user.getId());
        Integer questionLimit = user.getQuestionLimit();
        if (questionLimit < 1) {
            return new Result().error("今日答题次数已用完！");
        }

        //减一次答题次数
        user.setQuestionLimit((user.getQuestionLimit() - 1));
        user.setQuestionNum((user.getQuestionNum() + 1));

        //增加经验
        CommonUtils.addExperience(CommonUtils.getQuestionExperience(), userPetEntity);
        userPetService.updateById(userPetEntity);

        //增加宠物币
        Integer petCurrency = user.getPetCurrency() + CommonUtils.getQuestionPetCurrency();
        user.setPetCurrency(petCurrency);

        userService.updateById(user);
        return new Result();
    }

}