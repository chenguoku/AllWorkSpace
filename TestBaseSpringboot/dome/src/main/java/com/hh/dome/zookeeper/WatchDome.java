package com.hh.dome.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class WatchDome {

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {

        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ZooKeeper zooKeeper = new ZooKeeper("192.168.190.137:2181," +
                "192.168.190.138:2181,192.168.190.139:2181",4000,new Watcher(){
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println("默认事件："+watchedEvent.getType());

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

        //exists getData getChildren
        //通过exists绑定事件
        Stat stat = zooKeeper.exists("/zk-persis-hh", new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println(watchedEvent.getType() + "->" +watchedEvent.getPath());

                try {
                    zooKeeper.exists(watchedEvent.getPath(),true);
                } catch (KeeperException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        //通过修改的事务类型操作来触发事件监听
        stat = zooKeeper.setData("/zk-persis-hh", "2".getBytes(), stat.getVersion());

        Thread.sleep(1000);

        zooKeeper.delete("/zk-persis-hh",stat.getVersion());

        zooKeeper.close();

//        System.in.read();
    }

}
