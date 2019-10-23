package com.test.mapper;

import com.test.pojo.Users;

import java.util.List;

/**
 * @Description:
 * @Author: houwanglei
 * @CreateDate: 2019/10/21 20:55
 * @Version: 1.0
 */
public interface UsersMapper {

    public void insertUser(Users users);

    public List<Users> selectUserAll();

}
