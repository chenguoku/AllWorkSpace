package com.hh.springbootbeetldemo.underwriting;


import com.hh.springbootbeetldemo.underwriting.beetl.BeetlUtil;
import com.hh.springbootbeetldemo.underwriting.dto.BaseResponse;
import com.hh.springbootbeetldemo.underwriting.dto.PlatformDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname: AbstractUnderWritingAction
 * @Description: 基础核保时间
 * @Author: chenguoku
 * @Date 2020-11-9
 * @Version V1.0
 */
@Component
public abstract class AbstractUnderWritingAction {

    @Autowired
    private BeetlUtil beetlUtil;

    public BaseResponse underWriting(PlatformDto platformDto) {
        //城市编码
        cityTransform(platformDto);

        //职业编码转换
        professionTransform(platformDto);

        //核保请求报文转换,beetl
        String underwritingReq = beetlUtil.getBeetlString("hk_underwriting.req", platformDto);

        //调用保司核保
        Object o = callInsuranceCompany(platformDto, underwritingReq);

        //核保返回报文转换,beetl
        String underwritingResp = beetlUtil.getBeetlString("hk_underwriting.resp", o);

        //返回结果
        return null;
    }

    public void cityTransform(PlatformDto platformDto) {
    }

    public void professionTransform(PlatformDto platformDto) {
    }

    public Object callInsuranceCompany(PlatformDto platformDto, String reqString) {
        return null;
    }

}
