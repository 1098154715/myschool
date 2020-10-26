package com.example.cxk.demo.service;

import com.example.cxk.demo.service.impl.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.example.cxk.demo.util.EncryptUtil;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;

/**
 * @author cxk
 * @date 2020/8/5 9:45
 */
@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class StaticScheduleTask {
    @Autowired
    private MailServiceImpl mailService;
    @Scheduled(cron = "0 * * * * * ")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() throws UnsupportedEncodingException {
        /*mailService.sendSimpleMail("cxk1098154715@163.com","第一次发邮件","看我发邮件呢");
        mailService.sendSimpleMail("2100390933@qq.com","呵呵，我想","我给你发信息呢");*/
    }
}
