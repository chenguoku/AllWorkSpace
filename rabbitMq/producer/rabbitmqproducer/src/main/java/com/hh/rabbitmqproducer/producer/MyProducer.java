package com.hh.rabbitmqproducer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        //发送消息
        rabbitTemplate.convertAndSend("DIRECT_EXCHANGE","hh.best","a direct msg");

        rabbitTemplate.convertAndSend("TOPIC_EXCHANGE","shanghai.hh.1","a topic msg shanghai");
        rabbitTemplate.convertAndSend("TOPIC_EXCHANGE","beijing.hh.1","a topic msg beijing");

        rabbitTemplate.convertAndSend("FANOUT_EXCHANGE","","a fanout msg");
    }

}
