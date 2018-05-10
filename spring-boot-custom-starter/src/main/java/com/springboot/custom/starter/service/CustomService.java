package com.springboot.custom.starter.service;

import org.springframework.stereotype.Component;

/**
 * @author wangbowen
 * @Description TODO
 * @Date 2018/5/10 11:32
 */
public class CustomService {

  private String msg;

   private boolean isShow;

    public String sayMsg(){
        if(isShow){
            return  "hello,"+msg;
        }
         return  "hello,xiaoQ";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }
}
