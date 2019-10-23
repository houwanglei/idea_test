package com.test.web.controller;

import com.test.pojo.Users;
import com.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: houwanglei
 * @CreateDate: 2019/10/22 21:26
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        usersService.addUser(users);
        return "ok";
    }
}
