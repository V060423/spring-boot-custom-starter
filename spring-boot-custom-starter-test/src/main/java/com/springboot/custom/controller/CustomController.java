package com.springboot.custom.controller;

import com.springboot.custom.starter.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbowen
 * @Description TODO
 * @Date 2018/5/10 14:03
 */
@RestController
public class CustomController {

    @Autowired
    private CustomService customService;


    @GetMapping("/index")
    public String getMsg(){
      return  customService.sayMsg();
    }
}
