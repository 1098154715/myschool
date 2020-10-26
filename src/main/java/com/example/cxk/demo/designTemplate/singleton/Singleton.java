package com.example.cxk.demo.designTemplate.singleton;

/**
 * @author cxk
 * @date 2020/7/18 11:14
 * 单例模式
 */
public class Singleton {
    private static Singleton instance=null;
    private Singleton() {
    }
    public static Singleton getInstance(){
        if(instance==null){
            initSingleton();
        }
        return instance;
    }
    private static synchronized void initSingleton() {
       instance=new Singleton();
    }
}
