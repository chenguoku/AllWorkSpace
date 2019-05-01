package com.hh.config;

import com.github.pagehelper.PageInterceptor;
import com.hh.plugins.TestPlugin;
import com.hh.typehandlers.TestTypeHandler;
import org.apache.ibatis.executor.loader.cglib.CglibProxyFactory;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by James
 * Description:
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.hh.mapper")
public class MybatisConfig {
    @Autowired
    @Qualifier("dataSource")
    public DataSource dataSource;


    @Lazy(false)
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory localSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/mybatis/*.xml"));//扫描mapper.xml文件
//        sqlSessionFactoryBean.setTypeHandlers(new TypeHandler[]{new TestTypeHandler()});//注册typeHandler
//        sqlSessionFactoryBean.setTypeHandlersPackage("com.gupao.dal.typehandles");
//        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new TestPlugin()});//注册plugin插件的
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageInterceptor()});//注册pagehelper
        SqlSessionFactory factory = sqlSessionFactoryBean.getObject();
//        factory.getConfiguration().setLazyLoadingEnabled(true);
//        factory.getConfiguration().setAggressiveLazyLoading(false);
//        factory.getConfiguration().setProxyFactory(new CglibProxyFactory());
        return factory;
    }

    /**
     * pageHelper
     * @return
     */
    private PageInterceptor pageInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.put("helperDialect", "mysql");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }

    @Primary
    @Lazy(false)
    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(localSessionFactoryBean(), ExecutorType.SIMPLE);
    }

    @Lazy(false)
    @Bean(name = "batchSst")
    public SqlSessionTemplate batchSst() throws Exception {
        return new SqlSessionTemplate(localSessionFactoryBean(), ExecutorType.BATCH);
    }

    @Bean(name = "txManager")
    public DataSourceTransactionManager dataSourceTransactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
