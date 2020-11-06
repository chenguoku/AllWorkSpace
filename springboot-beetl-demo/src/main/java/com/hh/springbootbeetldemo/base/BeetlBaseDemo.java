package com.hh.springbootbeetldemo.base;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;

import java.io.IOException;

/**
 * @Classname: BeetlBaseDemo
 * @Description: Beetl最基本的使用
 * @Author: chenguoku
 * @Date 2020-10-26
 * @Version V1.0
 */
public class BeetlBaseDemo {

    public static void main(String[] args) throws IOException {
        //new 一个模板资源加载器
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();

        /**
         * 使用Beetl默认的配置
         * Beetl可以使用配置文件的方式配置，但是由于此处是直接上手的例子
         * 我们不去管配置的问题，只需要基本的默认配置就可以了
         */
        Configuration configuration = Configuration.defaultConfiguration();
        //Beetl的核心GroupTemplate
        GroupTemplate groupTemplate = new GroupTemplate(resourceLoader, configuration);

        //自定义的模板，其中${title}就Beetl默认的占位符
        String testTemplate = "111111${title},22222${name}";
        Template template = groupTemplate.getTemplate(testTemplate);
        template.binding("title", "哈哈");
        template.binding("name", "呵呵");

        //渲染字符串
        String render = template.render();
        System.out.println(render);
    }

}
