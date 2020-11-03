package com.hh.dome.jsonpath;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: JsonPathDemo
 * @Description: JsonPath的使用
 * @Author: chenguoku
 * @Date 2020-11-3
 * @Version V1.0
 */
public class JsonPathDemo {

    public static void main(String[] args) {
        JsonEntity jsonEntity1 = new JsonEntity();
        jsonEntity1.setName("第一层1");
        jsonEntity1.setSex("第一层性别1");

        List<JsonEntity> list = new ArrayList<>();
        JsonEntity jsonEntity11 = new JsonEntity();
        jsonEntity11.setName("第二层11");
        jsonEntity11.setSex("第二层性别11");

        list.add(jsonEntity11);
        jsonEntity1.setList(list);

        String string = JSON.toJSONString(jsonEntity1);
        System.out.println(string);

        Object read = JSONPath.read(string, "$.list[0].name");
        System.out.println(String.valueOf(read));

        JSONPath.set(jsonEntity1, "$.list[0].name", "替换11");
        System.out.println(JSON.toJSONString(jsonEntity1));

    }

}
