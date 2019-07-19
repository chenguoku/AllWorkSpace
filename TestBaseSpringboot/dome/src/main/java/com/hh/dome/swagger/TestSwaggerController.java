package com.hh.dome.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName TestSwaggerController.java
 * @Description 测试
 * @createTime 2019年07月19日
 */
@RestController
@RequestMapping("test")
@Api(tags = "测试")
public class TestSwaggerController {

    @GetMapping("list")
    @ApiOperation("测试获取list")
    public List listTest(){

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        return list;
    }

}
