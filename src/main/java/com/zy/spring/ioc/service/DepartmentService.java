package com.zy.spring.ioc.service;

import com.zy.spring.ioc.dao.IUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class DepartmentService {

    /**
     * 1.@Resource设置name属性，则按name在IoC容器中注入bean
     * 2.@Resource未设置name
     * 2.1 以属性名作为bean，name在IoC容器中匹配bean，如有匹配则注入
     * 2.2 按属性名不匹配，则按类型进行匹配，同@Autowired,需要加入@Primary解决类型冲突
     * 使用建议:在使用@Resource对象时设置name或则保证属性名与bean名称一致
     */
//    @Resource
//    private IUserDao udao;
    @Resource
    //private IUserDao userOracleDao;
    private IUserDao userDao;

    public void joinDepartment(){
       // System.out.println(userOracleDao);
         System.out.println(userDao);
    }
}
