package com.hh.dome.security;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security")
@Api(tags = "security测试")
public class SecurityTestController {

    @GetMapping("test")
    public String test(){
        String string = "hello security";
        return string;
    }


}
