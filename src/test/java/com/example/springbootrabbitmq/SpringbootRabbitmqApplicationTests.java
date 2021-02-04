package com.example.springbootrabbitmq;

import com.example.springbootrabbitmq.bean.book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringbootRabbitmqApplicationTests {

    @Resource
    RabbitTemplate rabbitTemplate;

    @Test
    void contextLoads() {
        Map<String,Object> map=new HashMap<>();
        map.put("msg","这是第一个消息");
        map.put("data", Arrays.asList("hello",23,false));
        book b = new book("孙悟空","吴承恩");
        rabbitTemplate.convertAndSend("exchange.direct","atguigu",b);
    }

    @Test
    public void receive(){
        Object obj = rabbitTemplate.receiveAndConvert("atguigu");
        System.out.println(obj);
    }

}
