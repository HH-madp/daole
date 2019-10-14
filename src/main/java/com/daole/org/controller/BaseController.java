package com.daole.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daole")
public class BaseController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello,我们要开始测试项目了";
    }
}
