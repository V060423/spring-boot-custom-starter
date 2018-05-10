package com.springboot.custom.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangbowen
 * @Description TODO
 * @Date 2018/5/10 11:29
 */
@ConfigurationProperties(prefix =CustomProperties.CUSTOM_PRE )
public class CustomProperties {
    static final String CUSTOM_PRE ="custom";
    /**
     * 消息
     */
    private String message;

    /**
     *  是否显示消息
     */
    private boolean show =true;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
