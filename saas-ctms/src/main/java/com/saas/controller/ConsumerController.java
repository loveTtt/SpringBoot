package com.saas.controller;

import com.saas.entity.HfnsTerm;
import com.saas.service.HfnsTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 消费者客户控制器
 */
@RestController
public class ConsumerController {
    @Autowired
    private HfnsTermService hfnsTermService;

    /**
     * 监听队列
     * @param message
     */
    @JmsListener(destination="queue")
    public void readActiveQueue(String message) {
        System.out.println("queue模式接收：" + message);
        //TODO something
    }
    @JmsListener(destination = "queue")
    public void readQueue(String message){
        System.out.println("queue模式接收："+message);
    }
    @JmsListener(destination = "topic")
    public void receiveMessage(String message) throws InterruptedException {
//        Thread.sleep(4000);
        System.out.println(hfnsTermService.getCount());
        System.out.println(new Date().toString()+"topic接收:"+message);
    }
    @JmsListener(destination = "topic")
    public void readResponse(String message) throws InterruptedException {
//        Thread.sleep(1000);
        for(HfnsTerm hfnsTerm:hfnsTermService.getHfnsTerm()){
            System.out.println(hfnsTerm.getId());
        }
        System.out.println(new Date().toString()+"topic1接收:"+message);
    }
}
