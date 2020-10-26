package com.example.cxk.demo.designTemplate.factory;

/**
 * @author cxk
 * @date 2020/7/18 10:25
 */
public class FndSmsSender implements FactorySend {
    @Override
    public void send() {
        System.out.println("这是发送短信的实体类");
    }
}
