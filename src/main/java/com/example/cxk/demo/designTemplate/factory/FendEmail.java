package com.example.cxk.demo.designTemplate.factory;

/**
 * @author cxk
 * @date 2020/7/18 10:24
 */
public class FendEmail implements FactorySend {
    @Override
    public void send() {
        System.out.println("这个是发送email的实体类");
    }
}
