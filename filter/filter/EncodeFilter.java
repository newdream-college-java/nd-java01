package com.cc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.cc.servlet.MyRequest;

public class EncodeFilter implements Filter {
    public void destroy() {

    }

    /*
     * ServletRequest:针对所有的网络协议(ftp https http smtp.....)
     * HttpServletRequest：针对http协议 (get、post)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        MyRequest req = new MyRequest((HttpServletRequest)request);
        // 验证
        String[] uname = req.getParameterValues("uname");
        System.out.println("filter-------uname====" + uname);
        // 2.放行
        chain.doFilter(req, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
