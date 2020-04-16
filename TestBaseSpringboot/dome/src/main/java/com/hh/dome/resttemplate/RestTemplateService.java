package com.hh.dome.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName RestTemplateTest.java
 * @Description RestTemplate使用
 * @createTime 2020年04月15日
 */
@Service
public class RestTemplateService {

    @Autowired
    private RestTemplate externalRestTemplate;

    public String getForObject(String url, Class responseType, Object... uriVariables) {
        String forObject = externalRestTemplate.getForObject(url, String.class);
        return forObject;
    }

    public String getForEntity(String url, Class responseType, Object... uriVariables) {
        ResponseEntity<String> forEntity = externalRestTemplate.getForEntity(url, String.class, uriVariables);
        String body = forEntity.getBody();
        return body;
    }

//    public String post(){
//        externalRestTemplate.getForEntity()
//    }


}
