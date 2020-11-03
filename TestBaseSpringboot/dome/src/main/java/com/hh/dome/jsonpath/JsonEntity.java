package com.hh.dome.jsonpath;

import lombok.Data;

import java.util.List;

/**
 * @Classname: JsonEntity
 * @Description: JsonPath测试对象
 * @Author: chenguoku
 * @Date 2020-11-3
 * @Version V1.0
 */
@Data
public class JsonEntity {

    private String name;

    private String sex;

    private List<JsonEntity> list;

}
