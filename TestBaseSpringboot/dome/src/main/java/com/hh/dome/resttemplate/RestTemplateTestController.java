package com.hh.dome.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName RestTemplateTestController.java
 * @Description TODO
 * @createTime 2020年04月15日 16:36:00
 */
@RestController
@RequestMapping("rest/test")
public class RestTemplateTestController {

    @Autowired
    private RestTemplateService restTemplateService;

    @Autowired
    private RestTemplate externalRestTemplate;

    @GetMapping("")
    public String test() throws URISyntaxException {
///////////////////////////////////GET/////////////////////////////////////////////////////////////
//        ResponseEntity<String> forEntity = externalRestTemplate.getForEntity("http://127.0.0.1:8081/restTemplate/get", String.class);
//        String body = forEntity.getBody();

//        ResponseEntity<String> forEntity = externalRestTemplate.getForEntity("http://127.0.0.1:8081/restTemplate/get?a={a}&&b={b}", String.class, "1", "2");
//        String body = forEntity.getBody();

//        Map<String, Object> map = new HashMap<>();
//        map.put("a", 1);
//        map.put("b", 2);
//        ResponseEntity<String> forEntity = externalRestTemplate.getForEntity("http://127.0.0.1:8081/restTemplate/get?a={a}&&b={b}", String.class, map);
//        String body = forEntity.getBody();

//////////////////////////////////POST////////////////////////////////////////////////////////////////
//        Map<String, String> requset = new HashMap<>();
//        requset.put("a", "1");
//        requset.put("b", "2");
//        String s = externalRestTemplate.postForObject("http://127.0.0.1:8081/restTemplate/post", requset, String.class);

//        Map<String, String> requset = new HashMap<>();
//        requset.put("a", "1");
//        requset.put("b", "2");
//        String s = externalRestTemplate.postForObject("http://127.0.0.1:8081/restTemplate/post?a={a}&b={b}", null, String.class, requset);

////////////////////////////////////exchange()////////////////////////////////////////////
//        Map<String, String> requset = new HashMap<>();
//        requset.put("a", "1");
//        requset.put("b", "2");
//        ResponseEntity<String> exchange = externalRestTemplate.exchange("http://127.0.0.1:8081/restTemplate/get?a={a}&b={b}", HttpMethod.GET, null, String.class, requset);
//        String body = exchange.getBody();
//
//        Map<String, String> requset = new HashMap<>();
//        requset.put("a", "1");
//        requset.put("b", "2");
//        HttpEntity<Map> requestEntity = new HttpEntity<>(requset, null);
//        ResponseEntity<String> exchange = externalRestTemplate.exchange("http://127.0.0.1:8081/restTemplate/post", HttpMethod.POST, requestEntity, String.class);
//        String body = exchange.getBody();


//        Map<String, String> requset = new HashMap<>();
//        requset.put("a", "1");
//        requset.put("b", "2");
//        RequestEntity requestEntity = new RequestEntity(HttpMethod.GET,new URI("http://127.0.0.1:8081/restTemplate/get"));
//        ResponseEntity<String> exchange = externalRestTemplate.exchange(requestEntity,String.class);
//        String body = exchange.getBody();
//        return body;
//
//        Map<String, String> requset = new HashMap<>();
//        requset.put("a", "1");
//        requset.put("b", "2");
//        RequestEntity requestEntity = new RequestEntity<Map>(requset,HttpMethod.POST,new URI("http://127.0.0.1:8081/restTemplate/post"));
//        ResponseEntity<String> exchange = externalRestTemplate.exchange(requestEntity,String.class);
//        String body = exchange.getBody();

        String url = "http://127.0.0.1:8081/restTemplate/get" + "/getall";
        ParameterizedTypeReference<List<Map>> parameterizedTypeReference = new ParameterizedTypeReference<List<Map>>() {
        };
        ResponseEntity<List<Map>> response = externalRestTemplate.exchange(url, HttpMethod.GET, null, parameterizedTypeReference);
        List<Map> deviceList = response.getBody();
        return deviceList.toString();
    }

}
