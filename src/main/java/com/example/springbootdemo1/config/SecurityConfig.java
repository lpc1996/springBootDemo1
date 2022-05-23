//package com.example.springbootdemo1.config;
//
//import com.example.springbootdemo1.util.GlobalVariable;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import javax.annotation.Resource;
//
///**
// * @package:com.example.springbootdemo1.config
// * @Author:旁观者
// * @Date:2022/5/14-11:44
// * @By:IntelliJ IDEA
// * @FileName:SecurityConfig.java
// */
//
////@Configuration
////@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.formLogin()
//                .loginPage("/toLogin")
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/index")
//                .failureUrl("/loginErr")
//                .usernameParameter(GlobalVariable.USERNAME)
//                .passwordParameter(GlobalVariable.PASSWORD);
//        http.authorizeRequests()
//                .antMatchers("/getVerifyCode").permitAll()
//                .antMatchers("/verify").permitAll()
//                .antMatchers("/toRegister").permitAll()
//                .antMatchers("/register").permitAll()
//                        .anyRequest().authenticated();
////                .antMatchers("/toLogin","/login",,,
////                        ,)
//        http.csrf().disable();
//        http.logout()
//                .logoutSuccessUrl("/toLogin");
//        http.rememberMe().rememberMeParameter("remember");
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
////        super.configure(web);
//        web.ignoring().antMatchers("/static/**","/getVerifyCode","/verify","/toRegister","/register");
//    }
//}
