package com.hh.dome.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class ConnectionDome {

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {

        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ZooKeeper zooKeeper = new ZooKeeper("192.168.190.137:2181," +
                "192.168.190.138:2181,192.168.190.139:2181",4000,new Watcher(){
            @Override
            public void process(WatchedEvent watchedEvent) {
                if (Event.KeeperState.SyncConnected == watchedEvent.getState()){
                    //如果收到了服务端的响应事件，连接成功
                    countDownLatch.countDown();
                }
            }
        });
        countDownLatch.await();
        System.out.println(zooKeeper.getState());

        //创建节点
        zooKeeper.create("/zk-persis-hh","0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        Thread.sleep(1000);
        Stat stat = new Stat();

        //得到当前节点的值
        byte[] data = zooKeeper.getData("/zk-persis-hh", null, stat);
        System.out.println(new String(data));

        //修改节点的值
        zooKeeper.setData("/zk-persis-hh","1".getBytes(),stat.getVersion());

        //得到当前节点的值
        byte[] data1 = zooKeeper.getData("/zk-persis-hh", null, stat);
        System.out.println(new String(data1));

        //删除当前节点
        zooKeeper.delete("/zk-persis-hh", stat.getVersion());

        zooKeeper.close();

        System.in.read();
    }

}
