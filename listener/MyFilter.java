package filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
    public MyFilter() {
        System.out.println("MyFilter 出生完成....");
    }
    /*
     * 当过滤器进行初始化时才会被调用
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter 进行初始化....");
    }
    /*
     * 当过滤器销毁的时候调用该方法
     */
    public void destroy() {
        System.out.println("MyFilter 过滤器销毁了....");
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
