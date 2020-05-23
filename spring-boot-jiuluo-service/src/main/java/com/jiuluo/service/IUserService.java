package com.jiuluo.service;

import com.jiuluo.entity.UserEntity;

import java.util.List;

/**
 * ClassName: com.jiuluo.service.IUserService
 * Author:   Huang
 * Date:     2020-05-22 23:45
 * Version: 1.0
 * Description: 用户业务层接口
 */
public interface IUserService {

    /**
     * @Description 查询所有用户信息
     * @return java.util.List<com.jiuluo.entity.UserEntity>
     * @Author  Huang
     * @Date 2020-05-22 23:50
     */
    List<UserEntity> getUserList();
}
