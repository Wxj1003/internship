package com.odianyun.internship.service.impl;

import com.odianyun.internship.mapper.UserMapper;
import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.UUser;
import com.odianyun.internship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: EDZ
 * @time: 14:26
 * @date: 2021/7/15
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public UUser getById(Long id) {
        return userMapper.getById(id);
    }

    @Override
    public void update(UUserDTO dto) {
        userMapper.update(dto);
    }
}
