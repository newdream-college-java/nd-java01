package com.cc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 1、过滤器必须实现filter接口(标准)
 * 2、filter声明周期：
 *      在什么时候构造？    在服务器启动，项目部署完。
 *      在什么时候初始化？在服务器启动，项目部署完。
 *      在什么时候进行过滤？在客户端访问servlet的时候。
 *      在什么时候效率？        项目移除或重新部署，服务器关闭
 *      
 *   3、filter生命周期与servlet的生命周期对比
 *      1.构造和初始化的时期不同：  
 *                  filter 实在服务器启动，项目部署
 *                  servlet 在第一次请求是进行构造
 * 
 */
public class MyFilter01 implements Filter{
    /*
     * 当过滤器构造
     */
    public MyFilter01() {
        System.out.println("MyFilter01 构造完成....");
    }
    /*
     * 当过滤器进行初始化时才会被调用
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter01 进行初始化....");
    }
    /*
     * 当过滤器销毁的时候调用该方法
     */
    public void destroy() {
        System.out.println("MyFilter01 过滤器销毁了....");
    }
    /*
     * 进行过滤服务的方法
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("过滤器开始工作......");
        //放行（很重要）
        chain.doFilter(request, response);
        
        System.out.println("过滤器结束工作......");
    }

    

}
