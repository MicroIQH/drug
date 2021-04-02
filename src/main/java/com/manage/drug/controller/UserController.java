package com.manage.drug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 杉子
 * @date 2021/4/2 20:37
 */
@Controller
@RequestMapping
public class UserController {

    /**
     * 转向登陆页面
     * @return
     */
    @RequestMapping(value = "login")
    public String login(){
        return "/login";
    }
}
