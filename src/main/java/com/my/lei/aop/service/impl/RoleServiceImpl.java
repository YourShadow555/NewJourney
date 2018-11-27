package com.my.lei.aop.service.impl;

import com.my.lei.aop.pojo.Role;
import com.my.lei.aop.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("{id:" + role.getId() + "," + "role_name:" + role.getName() + "," + "note:" + role.getNote() + "}");
    }
}
