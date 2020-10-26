package com.example.cxk.demo;

import com.example.cxk.demo.service.impl.AsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAsync
public class DemoApplicationTests {
    @Autowired
    private AsyncTask asyncTask;
    @Test
   public void contextLoads() throws Exception {
        long start = System.currentTimeMillis();

        asyncTask.doTaskOne();
        asyncTask.doTaskTwo();
        asyncTask.doTaskThree();

        long end = System.currentTimeMillis();

        System.out.println("总的运行，耗时：" + (end - start) + "毫秒");

    }

}
