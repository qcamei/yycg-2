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
public class IndexController {

    //欢迎页面
    @RequestMapping("/welcome")
    public String welcome(){
        return "/base/welcome";
    }
}
