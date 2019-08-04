package com.hh.dome.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

public class CuratorDome {

    public static void main(String[] args) throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory
                .builder().connectString("192.168.190.137:2181," +
                        "192.168.190.138:2181,192.168.190.139:2181")
                .sessionTimeoutMs(4000).retryPolicy(new
                        ExponentialBackoffRetry(1000,3))
                .namespace("curator").build();

        curatorFramework.start();

        //创建
        curatorFramework.create().creatingParentsIfNeeded()
                .withMode(CreateMode.PERSISTENT)
                .forPath("/hh/node1","1".getBytes());

        //删除
//        curatorFramework.delete().deletingChildrenIfNeeded().forPath("/hh/node1");

        //修改
        Stat stat = new Stat();
        curatorFramework.getData().storingStatIn(stat).forPath("/hh/node1");

        curatorFramework.setData().withVersion(stat.getVersion()).forPath("/hh/node1","xx".getBytes());

        curatorFramework.close();

    }

}
