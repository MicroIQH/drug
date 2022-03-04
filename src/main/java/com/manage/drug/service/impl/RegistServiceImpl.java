package com.manage.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.drug.entity.User;
import com.manage.drug.mapper.RegistMapper;
import com.manage.drug.service.IRegistService;
import org.springframework.stereotype.Service;

/**
 * @author 杉子
 * @date 2021/5/22 17:20
 */
@Service
public class RegistServiceImpl extends ServiceImpl<RegistMapper, User> implements IRegistService {

}
