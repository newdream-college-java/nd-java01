package com.cc.filter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//该过滤器一定要在web.xml中配置到 编码过滤器之后
public class InvalideCodeFilter implements Filter {
    private Properties ps;

    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response=(HttpServletResponse)res;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8"); 
       // System.out.println("进入过了过滤器");
        // 1.获取输入的文本内容
        String codeStr = request.getParameter("code");
        // 2.获取非法字符黑名单
        if (codeStr != null) {
            String value = ps.getProperty(codeStr);
            // 3.判断输入文本是否存在在黑名单，
            if (value != null) {
                // 情况1：如果再就返回和名单对应的值
                req.setAttribute("codeStr", value);
                // 情况2：不在黑明单就放行
            } else {
                req.setAttribute("codeStr", codeStr);
            }
           
        }
        chain.doFilter(req, res);// invalide.jsp
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext context = filterConfig.getServletContext();
        InputStream inputStream = context.getResourceAsStream("WEB-INF/invalite.properties");
        ps = new Properties();
        try {
            ps.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
