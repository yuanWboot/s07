package com.zy.spring.ioc;

import com.zy.spring.ioc.service.DepartmentService;
import com.zy.spring.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        //初始化IoC容器，加载xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取容器对象，将容器对象打印出来
//        String[] ids = context.getBeanDefinitionNames();
//        for (String id : ids) {
//            System.out.println(id + ":" + context.getBean(id));
//        }
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.getUserDao());

        DepartmentService departmentService = context.getBean("departmentService", DepartmentService.class);
        departmentService.joinDepartment();
    }
}
