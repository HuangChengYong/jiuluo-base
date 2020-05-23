package com.jiuluo.controller;

import com.jiuluo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Author:   Huang
 * Date:     2020-05-23 9:27
 * Version: 1.0
 * Description: 用户控制器
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/get_user_list")
    public String getUserList() {
        return iUserService.getUserList().toString();
    }
}
