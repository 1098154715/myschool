package com.example.cxk.demo.service;

import com.example.cxk.demo.config.RabbitMQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

/**
 * @author cxk
 * @date 2020/7/29 9:29
 */

@Component
@Slf4j
public class RabbitService {

    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitMQConfig.DIRECT_QUEUE)
    public void receiverDirectQueue(Map<String, Objects> user) {
        log.info("【receiverDirectQueue监听到消息】" + user.toString());
    }


}
