package com.jiuluo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * ClassName: UserEntity
 * Author:   Huang
 * Date:     2020-05-22 23:40
 * Version: 1.0
 * Description: 用户实体
 */
public class UserEntity {

    private Integer id;// 用户编号

    private String username;// 用户名

    private String password;// 密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserEntity(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserEntity() {
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
