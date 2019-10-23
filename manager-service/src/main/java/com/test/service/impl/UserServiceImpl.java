package com.test.service.impl;

import com.test.mapper.UsersMapper;
import com.test.pojo.Users;
import com.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: houwanglei
 * @CreateDate: 2019/10/22 21:30
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }
}
