package com.hh.dome.resttemplate;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName RestTemplateController.java
 * @Description RestTemplateController
 * @createTime 2020年04月15日
 */
@RestController
@RequestMapping("restTemplate")
public class RestTemplateController {

    @PostMapping("post")
    public String post(@RequestBody Map map) {
        return "只是post，没有参数";
    }

    @GetMapping("get")
    public String get(String a, String b) {
        return "只是get,没有参数";
    }

    @GetMapping("get/getall")
    public List<Map> get() {
        List<Map> list = new ArrayList<>();
        HashMap map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);

        list.add(map);
        list.add(map);
        return list;
    }
}
