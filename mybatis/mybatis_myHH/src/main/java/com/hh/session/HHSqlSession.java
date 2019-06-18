package com.hh.session;

import com.hh.config.HHConfiguration;
import com.hh.executor.HHExecutor;
import com.hh.mapper.HHMapperProxy;

import java.lang.reflect.Proxy;

public class HHSqlSession {

    private HHConfiguration hhConfiguration;
    private HHExecutor hhExecutor;

    public HHSqlSession(HHConfiguration hhConfiguration, HHExecutor hhExecutor) {
        this.hhConfiguration = hhConfiguration;
        this.hhExecutor = hhExecutor;
    }

    public HHConfiguration getHhConfiguration() {
        return hhConfiguration;
    }

    public <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new HHMapperProxy(this, clazz));
    }

    public <T> T selectOne(String statement,Object parameter){
        return hhExecutor.query(statement,parameter);
    }
}
