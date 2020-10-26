package com.example.cxk.demo.designTemplate.factory;

/**
 * @author cxk
 * @date 2020/7/18 10:53
 */
public class FndSmsFactory implements FactoryPrivateSend {
    @Override
    public FactorySend produce() {
        return  new FndSmsSender();
    }
}
