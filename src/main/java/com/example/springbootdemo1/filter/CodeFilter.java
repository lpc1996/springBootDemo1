//package com.example.springbootdemo1.filter;
//
//import com.example.springbootdemo1.util.GlobalVariable;
//import com.example.springbootdemo1.util.VerifyCodeUtil;
//import org.springframework.security.authentication.AuthenticationServiceException;
//import org.thymeleaf.util.StringUtils;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.http.HttpFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @package:com.example.springbootdemo1.filter
// * @Author:旁观者
// * @Date:2022/5/14-21:13
// * @By:IntelliJ IDEA
// * @FileName:CodeFilter.java
// */
//public class CodeFilter extends HttpFilter {
//
//    @Override
//    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
////        super.doFilter(request, response, chain);
////        ServletRequest req;
//        String uri = request.getServletPath();
//        if (uri.equals("/login") && request.getMethod().equalsIgnoreCase("post")) {
//            // 服务端生成的验证码数据
////            String sessionCode = request.getSession().getAttribute(GlobalVariable.VIRFY).toString();
////            System.out.println("正确的验证码: " + sessionCode);
//            // 用户输入的验证码数据
//            String formCode = request.getParameter(GlobalVariable.VIRFY).trim();
//            System.out.println("用户输入的验证码: " + formCode);
//            if (StringUtils.isEmpty(formCode)) {
//                throw new RuntimeException("验证码不能为空");
//            }
//            if (VerifyCodeUtil.verify(formCode)) {
//                System.out.println("验证通过");
//            } else {
//                throw new AuthenticationServiceException("验证码输入不正确");
//            }
//        }
//        chain.doFilter(request, response);
//    }
//}
