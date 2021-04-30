package com.manage.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.drug.entity.User;

/**
 * @author 杉子
 * @date 2021/4/30 13:12
 *
 * 用户表的service接口
 */
public interface IUserService extends IService<User> {
    /**
     * 根据用户名查询用户对象
     */
    public User queryUserByUsername(User user);
}
