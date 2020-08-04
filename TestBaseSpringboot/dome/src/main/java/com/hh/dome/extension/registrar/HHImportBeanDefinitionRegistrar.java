package com.hh.dome.extension.registrar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Classname: HHImportBeanDefinitionRegistrar
 * @Description: 动态注册Hello
 * @Author: chenguoku
 * @Date 2020-8-4
 * @Version V1.0
 */
public class HHImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClassName(Hello.class.getName());
        beanDefinitionRegistry.registerBeanDefinition("hello", beanDefinition);
    }
}
