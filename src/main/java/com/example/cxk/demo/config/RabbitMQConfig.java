package com.example.cxk.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author cxk
 * @date 2020/7/29 9:23
 */

@Configuration
public class RabbitMQConfig {
    public static final String DIRECT_QUEUE="direct_queue";
    /**
     * Direct模式
     * @return
     */
    @Bean
    public Queue directQueue() {
        // 第一个参数是队列名字，第二个参数是指是否持久化
        return new Queue(DIRECT_QUEUE, true);
    }


    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}
