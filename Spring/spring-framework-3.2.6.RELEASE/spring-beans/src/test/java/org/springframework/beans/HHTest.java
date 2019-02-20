/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 
 * @author Administrator
 */
public class HHTest {

	@Test
	public void testXmlBean() {
		//根据Xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
		ClassPathResource resource = new ClassPathResource("application-context.xml");
		//创建DefaultListableBeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		//创建XmlBeanDefinitionReader读取器，用于载入BeanDefinition。之所以需要BeanFactory作为参数，是因为会将读取
		//的信息回调配置给Factory
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		//XmlBeanDefinitionReader执行载入BeanDefinition的方法，最后会完成Bean的载入和注册，完成后bean就成功的放置
		//到IOC容器当中，以后我们就可以从中取得Bean来使用
		reader.loadBeanDefinitions(resource);
	}
	
}
