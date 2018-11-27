package com.my.lei.aop.config;

import com.my.lei.aop.aspect.RoleAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.my.lei.aop")
public class AopConfig {
    @Bean
    public RoleAspect getRoleAspect() {
        return new RoleAspect();
    }

}
