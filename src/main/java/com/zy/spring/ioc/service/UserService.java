package com.zy.spring.ioc.service;

import com.zy.spring.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    // spring IoC容器通过反射技术将属性private修饰符自动转为public，自动进行赋值，不再执行setter方法
    private UserDao userDao;

    public UserService() {
        System.out.println("正在创建UserService："+ this);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    //@Autowired
    //如果装配注解放在setter方法上，则自动按类型/名称对setter方法参数进行注入
    public void setUserDao(UserDao userDao) {
        System.out.println("setUserDao:"+userDao);
        this.userDao = userDao;
    }
}
