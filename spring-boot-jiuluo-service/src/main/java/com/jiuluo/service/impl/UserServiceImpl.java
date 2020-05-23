package com.jiuluo.service.impl;

import com.jiuluo.entity.UserEntity;
import com.jiuluo.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Author:   Huang
 * Date:     2020-05-22 23:51
 * Version: 1.0
 * Description: 用户业务层实现类
 */
@Service
public class UserServiceImpl implements IUserService {

    /**
     * @Description 查询所有用户信息
     * @return java.util.List<com.jiuluo.entity.UserEntity>
     * @Author  Huang
     * @Date 2020-05-22 23:51
     */
    @Override
    public List<UserEntity> getUserList() {
        List<UserEntity> userEntityList = new ArrayList<>();
        userEntityList.add(new UserEntity(1, "username1"));
        userEntityList.add(new UserEntity(2, "username2"));
        userEntityList.add(new UserEntity(3, "username3"));
        userEntityList.add(new UserEntity(4, "username4"));
        userEntityList.add(new UserEntity(5, "username5"));
        userEntityList.add(new UserEntity(6, "jiuluo"));
        return userEntityList;
    }
}
