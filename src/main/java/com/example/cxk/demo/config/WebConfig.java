package com.example.cxk.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cxk
 * @date 2020/8/3 19:30
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 配置访问前缀
        registry.addResourceHandler("/static/**")
                //配置文件真实路径
                .addResourceLocations("file:/static/");
    }
}
