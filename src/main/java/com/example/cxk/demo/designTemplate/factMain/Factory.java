package com.example.cxk.demo.designTemplate.factMain;

import com.example.cxk.demo.designTemplate.adapter.Adapter220_5;
import com.example.cxk.demo.designTemplate.adapter.FactoryA220;
import com.example.cxk.demo.designTemplate.adapter.Phone;
import com.example.cxk.demo.designTemplate.factory.FactoryPrivateSend;
import com.example.cxk.demo.designTemplate.factory.EmailFactory;
import com.example.cxk.demo.designTemplate.factory.FndSmsFactory;

/**
 * @author cxk
 * @date 2020/7/18 10:37
 */
public class Factory {
    public static void main(String[] args) {
        FactoryPrivateSend factoryPrivateSend=new EmailFactory();
        factoryPrivateSend.produce().send();
        factoryPrivateSend=new FndSmsFactory();
        factoryPrivateSend.produce().send();
        FactoryA220 factoryA220=new FactoryA220();
        new Adapter220_5(factoryA220).getPhone().work();
    }
}
