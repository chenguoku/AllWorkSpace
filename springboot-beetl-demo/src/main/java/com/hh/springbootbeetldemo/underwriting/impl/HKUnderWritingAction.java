package com.hh.springbootbeetldemo.underwriting.impl;

import com.hh.springbootbeetldemo.underwriting.AbstractUnderWritingAction;
import com.hh.springbootbeetldemo.underwriting.dto.PlatformDto;

/**
 * @Classname: HKUnderWritingAction
 * @Description: HK
 * @Author: chenguoku
 * @Date 2020-11-9
 * @Version V1.0
 */
public class HKUnderWritingAction extends AbstractUnderWritingAction {
    @Override
    public void professionTransform(PlatformDto platformDto) {
        System.out.println("HKUnderWritingAction做了职业编码转换");
    }
}
