package com.cyb.yycg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Descripttion TODO
 * @Author chenyongbo
 * @Date 2019/3/28 11:54
 **/
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login/login";
    }


}
