package com.example.springbootrabbitmq.service;

import com.example.springbootrabbitmq.bean.book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class bookService {

    @RabbitListener(queues = "atguigu")
    public void receive(book book){
        System.out.println("结果是"+book);
    }
}
