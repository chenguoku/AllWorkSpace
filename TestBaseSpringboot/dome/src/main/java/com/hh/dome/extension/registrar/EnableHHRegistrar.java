package com.hh.dome.extension.registrar;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Classname: EnableHHRegistrar
 * @Description: Registrar注解
 * @Author: chenguoku
 * @Date 2020-8-4
 * @Version V1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HHImportBeanDefinitionRegistrar.class)
public @interface EnableHHRegistrar {
}
