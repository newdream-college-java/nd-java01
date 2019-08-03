package com.cc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * 老师证：标准=====接口(一组功能约束)
 *  jdk黑客======>实现了jdk黑客的接口
 */
public class JdkHk implements InvocationHandler{
    //目标
    private Object target;
    public JdkHk(Object target) {
        this.target= target;
    }
    /*
     * 入侵的方法
     * proxy：     代理对象
     * method： 目标对象的目标方法 (反射 Field Method Constructor)
     * args：      目标对象的目标方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("开始入侵");
       args[0]=100;
       args[1]=200;
        Object result = method.invoke(target, args);
        System.out.println("结束入侵");
        return result;
    }
    
}
