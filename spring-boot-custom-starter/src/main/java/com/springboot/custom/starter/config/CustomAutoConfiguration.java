package com.springboot.custom.starter.config;

import com.springboot.custom.starter.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangbowen
 * @Description TODO
 * @Date 2018/5/10 11:36
 */
@Configuration
@EnableConfigurationProperties(CustomProperties.class)
@ConditionalOnClass(CustomService.class)
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (
                prefix = "custom",//存在配置前缀hello
                value = "enabled",//开启
                matchIfMissing = true//缺失检查
        )
public class CustomAutoConfiguration {
    @Autowired
    private CustomProperties customProperties;

    @Bean
    @ConditionalOnMissingBean(CustomService.class)//缺失CustomService实体bean时，初始化CustomService并添加到SpringIoc
    public CustomService customService(){
        System.out.println(">>>The CustomService Not Found，Execute Create New Bean.");
        CustomService c = new CustomService();
        String message = customProperties.getMessage();
        boolean show = customProperties.isShow();
        c.setMsg(message);
        c.setShow(show);
        return c;

    }
}

