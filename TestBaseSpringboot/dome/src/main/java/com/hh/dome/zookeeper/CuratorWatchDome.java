package com.hh.dome.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.*;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class CuratorWatchDome {

    public static void main(String[] args) throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory
                .builder().connectString("192.168.190.137:2181," +
                        "192.168.190.138:2181,192.168.190.139:2181")
                .sessionTimeoutMs(4000).retryPolicy(new
                        ExponentialBackoffRetry(1000,3))
                .namespace("curator").build();

        curatorFramework.start();

        //当前节点的创建和删除时间监听
        addListenerWithNodeCache(curatorFramework,"/hh");

        //子节点的增加、修改、删除的事件监听
        addListenerWithPathChildCache(curatorFramework,"/hh");

        //综合节点监听事件
        addListenerWithTreeCache(curatorFramework,"/hh");
        System.in.read();
    }

    /**
     * PathChildCache   监听一个节点下子节点的创建、删除、更新
     * NodeCache        监听一个节点的更新和创建事件
     * TreeCache        综合PathChildCache和NodeCache的特性
     */

    public static void addListenerWithTreeCache(CuratorFramework curatorFramework,String path) throws Exception {

        TreeCache treeCache = new TreeCache(curatorFramework,path);
        TreeCacheListener treeCacheListener = new TreeCacheListener() {
            @Override
            public void childEvent(CuratorFramework curatorFramework, TreeCacheEvent treeCacheEvent) throws Exception {
                System.out.println("Receive Event:"+treeCacheEvent.getData().getPath());
            }
        };
        treeCache.getListenable().addListener(treeCacheListener);
        treeCache.start();

    }

    public static void addListenerWithPathChildCache(CuratorFramework curatorFramework,String path) throws Exception {
        PathChildrenCache pathChildrenCache = new PathChildrenCache(curatorFramework,path,true);

        PathChildrenCacheListener pathChildrenCacheListener = new PathChildrenCacheListener() {
            @Override
            public void childEvent(CuratorFramework curatorFramework, PathChildrenCacheEvent pathChildrenCacheEvent) throws Exception {
                System.out.println("Receive Event:"+pathChildrenCacheEvent.getType());
            }
        };
        pathChildrenCache.getListenable().addListener(pathChildrenCacheListener);
        pathChildrenCache.start(PathChildrenCache.StartMode.NORMAL);
    }

    public static void addListenerWithNodeCache(CuratorFramework curatorFramework,String path) throws Exception {
        NodeCache nodeCache = new NodeCache(curatorFramework,path,false);
        NodeCacheListener nodeCacheListener = new NodeCacheListener() {
            @Override
            public void nodeChanged() throws Exception {
                System.out.println("Receive Event:"+nodeCache.getCurrentData().getPath());
            }
        };
        nodeCache.getListenable().addListener(nodeCacheListener);
        nodeCache.start();
    }

}
