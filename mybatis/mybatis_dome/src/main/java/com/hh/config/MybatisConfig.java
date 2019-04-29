package com.hh.config;

import com.hh.typehandlers.TestTypeHandler;
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
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/mybatis/*.xml"));
        sqlSessionFactoryBean.setTypeHandlers(new TypeHandler[]{new TestTypeHandler()});
//        sqlSessionFactoryBean.setTypeHandlersPackage("com.gupao.dal.typehandles");
//        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new TestPlugin()});
//        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageInterceptor()});
        SqlSessionFactory factory = sqlSessionFactoryBean.getObject();
//        factory.getConfiguration().setLazyLoadingEnabled(true);
//        factory.getConfiguration().setAggressiveLazyLoading(false);
//        factory.getConfiguration().setProxyFactory(new CglibProxyFactory());
        return factory;
    }

//    private PageInterceptor pageInterceptor() {
//        PageInterceptor pageInterceptor = new PageInterceptor();
//        Properties properties = new Properties();
//        properties.put("helperDialect", "mysql");
//        pageInterceptor.setProperties(properties);
//        return pageInterceptor;
//    }

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
