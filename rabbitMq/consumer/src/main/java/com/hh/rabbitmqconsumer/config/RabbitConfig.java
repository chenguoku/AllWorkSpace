package com.hh.rabbitmqconsumer.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    //定义三个交换机
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("DIRECT_EXCHANGE");
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("TOPIC_EXCHANGE");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("FANOUT_EXCHANGE");
    }

    //定义四个队列
    @Bean
    public Queue firstQueue(){
        return new Queue("FIRST_QUEUE");
    }

    @Bean
    public Queue secondQueue(){
        return new Queue("SECOND_QUEUE");
    }

    @Bean
    public Queue thirdQueue(){
        return new Queue("THIRD_QUEUE");
    }

    @Bean
    public Queue fourthQueue(){
        return new Queue("FOURTH_QUEUE");
    }

    //定义四个绑定关系
    @Bean
    public Binding bindFirst(@Qualifier("firstQueue") Queue queue,
                             @Qualifier("directExchange") DirectExchange directExchange){
        return BindingBuilder.bind(queue).to(directExchange).with("hh.best");
    }

    @Bean
    public Binding bindSecond(@Qualifier("secondQueue") Queue queue,
                             @Qualifier("topicExchange") TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with("*.hh.*");
    }

    @Bean
    public Binding bindThird(@Qualifier("thirdQueue") Queue queue,
                             @Qualifier("fanoutExchange") FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }

    @Bean
    public Binding bindFourth(@Qualifier("fourthQueue") Queue queue,
                             @Qualifier("fanoutExchange") FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }

}
