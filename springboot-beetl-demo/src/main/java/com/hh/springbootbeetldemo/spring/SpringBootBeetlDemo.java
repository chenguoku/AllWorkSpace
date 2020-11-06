package com.hh.springbootbeetldemo.spring;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname: SpringBootBeetlDemo
 * @Description: SpringBootBeetlDemo
 * @Author: chenguoku
 * @Date 2020-10-26
 * @Version V1.0
 */
@Service
public class SpringBootBeetlDemo {

    @Autowired
    private BeetlGroupUtilConfiguration beetlGroupUtilConfiguration;

    public String getString(String templatePath) {
        GroupTemplate groupTemplate = beetlGroupUtilConfiguration.getGroupTemplate();
        Template template = groupTemplate.getTemplate(templatePath);
        Map<String, String> map = new HashMap<>();
        map.put("title", "哈哈");
        map.put("name", "憨厚2016");
        template.binding(map);
        return template.render();
    }

}
