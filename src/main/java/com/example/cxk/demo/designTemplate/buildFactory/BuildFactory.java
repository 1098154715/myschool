package com.example.cxk.demo.designTemplate.buildFactory;

import com.example.cxk.demo.designTemplate.factory.FactorySend;
import com.example.cxk.demo.designTemplate.factory.FendEmail;
import com.example.cxk.demo.designTemplate.factory.FndSmsFactory;
import com.example.cxk.demo.designTemplate.factory.FndSmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * @author cxk
 * @date 2020/7/18 11:27
 */
public class BuildFactory{
    private List<FactorySend> list=new ArrayList<>();
    public void buildEmail(int count){
        for(int i=0;i<count;i++){
            FendEmail fendEmail=new FendEmail();
            list.add(fendEmail);
        }
    }
    public void buildSend(int count){
        for(int i=0;i<count;i++){
            FndSmsSender fndSmsSender=new FndSmsSender();
            list.add(fndSmsSender);
        }
    }
}
