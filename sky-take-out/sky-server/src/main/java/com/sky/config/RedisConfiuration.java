package com.sky.config;

import com.sky.properties.RedisProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Slf4j
@Configuration
public class RedisConfiuration {
    private final RedisProperties properties;
    public RedisConfiuration(RedisProperties properties){
        this.properties = properties;
    }

    @Bean
    RedisTemplate redisTemplate(RedisConnectionFactory factory){
        log.info("创建RedisTemplate...");
        RedisTemplate redisTemplate = new RedisTemplate();
        // 设置连接工厂对象
        redisTemplate.setConnectionFactory(factory);
        // 设置序列化器
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
