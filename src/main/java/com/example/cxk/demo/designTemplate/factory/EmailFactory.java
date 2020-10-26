package com.example.cxk.demo.designTemplate.factory;

/**
 * @author cxk
 * @date 2020/7/18 10:45
 */
public class EmailFactory implements FactoryPrivateSend {

    @Override
    public FactorySend produce() {
        return new FendEmail();
    }
}
