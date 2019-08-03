package com.cc.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 * 符合黑客的标准：接口(spring)
 */
public class SpringHk  implements MethodInterceptor{
    /*
     * methodInvocation:目标方法
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
      
        System.out.println("====开始入侵=====");
        Object[] arguments = methodInvocation.getArguments();
        arguments[0]=100;
        arguments[1]=200;
        //执行目标方法  result目标方法的返回值
        Object result = methodInvocation.proceed();
        System.out.println("====开始入侵=====");
        return result;
    }

}
