package com.cyb.yycg.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @ClassName MyMvcConfiguration
 * @Descripttion TODO
 * @Author chenyongbo
 * @Date 2019/3/28 16:05
 **/
@Configuration
public class MyMvcConfiguration extends WebMvcConfigurerAdapter {

    private final Logger logger = LoggerFactory.getLogger(MyMvcConfiguration.class);

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptor()).excludePathPatterns("/login","/static/**");
    }

}
