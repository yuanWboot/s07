package com.zy.spring.ioc.dao;

import org.springframework.stereotype.Repository;
//组件类型注解默认beanId为类名首字母小写
//beanId = userDao

@Repository("udao")
public class UserDao {
}
