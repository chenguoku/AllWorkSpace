package com.hh.dome.pool;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * JdbcUtils工具类对象池工厂
 */
public class MyPoolFactory extends BasePooledObjectFactory<LookHomeResultVo> {

    static GenericObjectPool<LookHomeResultVo> pool = null;
    static int num = 1;

    // 取得对象池工厂实例
    public synchronized static GenericObjectPool<LookHomeResultVo> getInstance() {
        if (pool == null) {
            GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
            poolConfig.setMaxIdle(20);
            poolConfig.setMaxTotal(100);
            poolConfig.setMinIdle(10);
            poolConfig.setLifo(false);
            pool = new GenericObjectPool<LookHomeResultVo>(new MyPoolFactory(), poolConfig);
        }
        return pool;
    }

    public static LookHomeResultVo borrowObject() throws Exception {
        return (LookHomeResultVo) MyPoolFactory.getInstance().borrowObject();
    }

    public static void returnObject(LookHomeResultVo jdbcUtils) throws Exception {
        MyPoolFactory.getInstance().returnObject(jdbcUtils);
    }

    public static void close() throws Exception {
        MyPoolFactory.getInstance().close();
    }

    public static void clear() throws Exception {
        MyPoolFactory.getInstance().clear();
    }

    @Override
    public LookHomeResultVo create() throws Exception {
        LookHomeResultVo lookHomeResultVo = new LookHomeResultVo();
        lookHomeResultVo.setPageNo(num++);
        return lookHomeResultVo;
    }

    @Override
    public PooledObject<LookHomeResultVo> wrap(LookHomeResultVo obj) {
        return new DefaultPooledObject<LookHomeResultVo>(obj);
    }
}