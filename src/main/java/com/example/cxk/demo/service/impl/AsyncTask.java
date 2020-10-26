package com.example.cxk.demo.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author cxk
 * @date 2020/8/5 9:24
 */
@Component
public class AsyncTask {
    //任务一;
    @Async
    public void doTaskOne() throws Exception {

        System.out.println("开始做任务一");

        long start = System.currentTimeMillis();

        Thread.sleep(1000);

        long end = System.currentTimeMillis();

        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");

    }



    //任务二;
    public void doTaskTwo() throws Exception {

        System.out.println("开始做任务二");

        long start = System.currentTimeMillis();

        Thread.sleep(1000);

        long end = System.currentTimeMillis();

        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");

    }



    //任务3;
    //@Async
    public void doTaskThree() throws Exception {

        System.out.println("开始做任务三");

        long start = System.currentTimeMillis();

        Thread.sleep(1000);

        long end = System.currentTimeMillis();

        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");

    }
}
