package com.manage.drug.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.drug.common.ResultMapUtil;
import com.manage.drug.entity.User;
import com.manage.drug.mapper.RegistMapper;
import com.manage.drug.service.impl.RegistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 杉子
 * @date 2021/5/22 16:56
 */
@Controller
public class RegistController {
    @Autowired
    private RegistServiceImpl registService;

    @Autowired
    private RegistMapper registMapper;



    @RequestMapping(value = "/regist")
    public String regist(){
        return "/regist";
    }

    /**
     * 判断用户注册是否成功
     */
    @RequestMapping(value = "/toRegist")
    @ResponseBody
    public Object toRegist(User user){

        if(user.getUsername()==null||user.getPassword()==null){
            return ResultMapUtil.getHashMapLogin("用户名密码不能为空","2");
        }
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername());
        if (registMapper.selectCount(wrapper)>0){
            return ResultMapUtil.getHashMapLogin("用户存在","2");
        }


        registService.save(user);


        return ResultMapUtil.getHashMapLogin("验证成功","1");
    }
}
