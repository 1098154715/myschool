package com.example.cxk.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author cxk
 * @date 2020/8/7 16:01
 */
@Component
public class RedisUtils {
    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    public String addLoginRedis(String key,Object obj ){
        redisTemplate.opsForValue().set(key,obj,7, TimeUnit.DAYS);
        return key;
    }
    public static String getLoginKey(){
        String uuid= UUID.randomUUID().toString().replace("-","");
        return "LOGIN_KEY_"+uuid;
    }

}
