package com.cc.servlet;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/*
 * 继承一个request装饰者对象(装饰者模式)
 */
public class MyRequest01 extends HttpServletRequestWrapper {
    private HttpServletRequest request;// 保存原来的request
    private boolean isChange = false;

    public MyRequest01(HttpServletRequest req) {
        super(req);
        this.request = req;
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        String method = request.getMethod();
        if (method.equalsIgnoreCase("post")) {
            // post请求
            try {
                // 处理post乱码
                request.setCharacterEncoding("utf-8");
                return request.getParameterMap();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else if (method.equalsIgnoreCase("get")) {
            // get请求
            Map parameterMap = request.getParameterMap();
            if (!isChange) { // 确保get手动编码逻辑只运行一次
                Set<String> keySet = parameterMap.keySet();
                for (String parameterName : keySet) {
                    String[] values = (String[]) parameterMap.get(parameterName);
                    if (values != null) {
                        for (int i = 0; i < values.length; i++) {
                            try {
                                values[i] = new String(values[i].getBytes("ISO-8859-1"), "utf-8");
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                isChange = true;
            }
            return parameterMap;
        }
//        try {
//            if (method.equalsIgnoreCase("post")) {
//                request.setCharacterEncoding("utf-8");
//                return super.getParameterMap();
//            } else if (method.equalsIgnoreCase("get")) {
//                Map<String, String[]> parameterMap = request.getParameterMap();
//                if (!isChange) {
//                    for (String key : parameterMap.keySet()) {
//                        String[] values = request.getParameterValues(key);
//                        if (values != null) {
//                            for (int i = 0; i < values.length; i++) {
//                                System.out.println("values[i]11111===" + values[i]);
//                                values[i] = new String(values[i].getBytes("iso-8859-1"), "utf-8");
//                                System.out.println("values[i]22222===" + values[i]);
//                            }
//                        }
//
//                    }
//                    isChange = true;
//                }
//                return parameterMap;
//            }
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        return super.getParameterMap();
    }

    @Override
    public String getParameter(String name) {
        String[] values = getParameterMap().get(name);
        if (values == null) {
            return null;
        }
        return values[0];
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = getParameterMap().get(name);
        if (values == null) {
            return null;
        }
        return values;
    }

}
