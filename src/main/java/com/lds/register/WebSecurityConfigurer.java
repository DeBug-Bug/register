package com.lds.register;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @program: repastsystem
 * @description:
 * @author:
 * @createData: 2019-11-05 15:49
 * @updateAuthor:
 * @updateData: 2019-11-05 15:49
 * @updateContent:
 * @Version: 1.0
 * @email: lidongshenglife@163.com
 * @blog: www.b0c0.com
 * ***********************************************
 *   Copyright @ 李东升 2019. All rights reserved
 * ***********************************************
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //开启认证
        //为了可以使用 http://${user}:${password}@${host}:${port}/eureka/ 这种方式登录,所以必须是httpBasic
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
