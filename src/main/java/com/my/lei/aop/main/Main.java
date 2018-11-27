package com.my.lei.aop.main;

import com.my.lei.aop.config.AopConfig;
import com.my.lei.aop.pojo.Role;
import com.my.lei.aop.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleService roleService =  ctx.getBean(RoleService.class);
        Role role = new Role();
        role.setId(1);
        role.setName("role_name_1");
        role.setNote("role_note_1");
        roleService.printRole(role);
        System.out.println("#############");
        //测试异常通知
        role = null;
        roleService.printRole(role);
    }
}
