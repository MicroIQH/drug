package com.manage.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.drug.entity.User;
import com.manage.drug.mapper.UserMapper;
import com.manage.drug.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杉子
 * @date 2021/4/30 13:18
 * 用户service实现
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User queryUserByUsername(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername());
        return userMapper.selectOne(wrapper);
    }
}
