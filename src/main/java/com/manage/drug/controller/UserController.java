package com.manage.drug.controller;

import com.manage.drug.common.ResultMapUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }

    /**
     * 判断用户登录是否成功
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping(value = "/toLogin")
    @ResponseBody
    public Object toLogin(String username,String password){
        return ResultMapUtil.getHashMapLogin("验证成功","1");
    }

    /**
     * 转向登后台管理面
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }

}
