package com.example.cxk.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author cxk
 * @date 2020/8/7 15:47
 */
@Configuration
public class RedisConfig {
    /**
     * redisTemplate
     */
    private static final StringRedisSerializer STRING_REDIS_SERIALIZER = new StringRedisSerializer();
    @Bean
    public RedisTemplate<String, Object> listObjectOperations(RedisConnectionFactory factory) {

        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        //设置序列化Key的实例化对象
        redisTemplate.setKeySerializer(STRING_REDIS_SERIALIZER);

        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        return redisTemplate;
    }

    /**
     * 登录用户
     */
    @Bean
    public RedisTemplate<String, String> listRedisUserOperations(RedisConnectionFactory factory) {

        RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        //设置序列化Key的实例化对象
        redisTemplate.setKeySerializer(STRING_REDIS_SERIALIZER);
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return redisTemplate;
    }

}
