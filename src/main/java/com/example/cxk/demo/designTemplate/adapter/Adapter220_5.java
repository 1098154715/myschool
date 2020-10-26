package com.example.cxk.demo.designTemplate.adapter;

/**
 * @author cxk
 * @date 2020/7/18 14:14
 */
public class Adapter220_5 {
    private FactoryA220 factoryA220;

    public Adapter220_5(FactoryA220 factoryA220) {
        this.factoryA220 = factoryA220;
    }
    public Phone getPhone(){
        factoryA220.Dian();
        System.out.println("将200v 转成5v电压");
        return new Phone();
    }

}
