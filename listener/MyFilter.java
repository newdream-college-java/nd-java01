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
        System.out.println("MyFilter �������....");
    }
    /*
     * �����������г�ʼ��ʱ�Żᱻ����
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter ���г�ʼ��....");
    }
    /*
     * �����������ٵ�ʱ����ø÷���
     */
    public void destroy() {
        System.out.println("MyFilter ������������....");
    }
    /*
     * ���й��˷���ķ���
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("��������ʼ����......");
        //���У�����Ҫ��
        chain.doFilter(request, response);
        
        System.out.println("��������������......");
    }

}
