package com.cyb.yycg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Descripttion TODO
 * @Author chenyongbo
 * @Date 2019/3/28 11:34
 **/
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/goLogin")
    public String sayHello(){
        return "login/login";
    }

    @RequestMapping("goFindpwd")
    public String goFindpwd(){
        return "login/forget-password";
    }
}
