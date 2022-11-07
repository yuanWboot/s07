package com.zy.spring.ioc.service;

import com.zy.spring.ioc.dao.IUserDao;
import com.zy.spring.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Scope("prototype")  //设置单例或多例 ，与XML中bean scope 完全相同
public class UserService {
    @Autowired
    // spring IoC容器通过反射技术将属性private修饰符自动转为public，自动进行赋值，不再执行setter方法
    private UserDao userDao;

    @PostConstruct   //XML 中init-method完全相同
    public void init(){
        System.out.println("初始化UserService对象");
    }
    private IUserDao udao;

    public IUserDao getUdao(){
        return udao;
    }

    public UserService() {
        System.out.println("正在创建UserService："+ this);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    //@Autowired
    //如果装配注解放在setter方法上，则自动按类型/名称对setter方法参数进行注入
//    public void setUserDao(UserDao userDao) {
//        System.out.println("setUserDao:"+userDao);
//        this.userDao = userDao;
//    }
}
