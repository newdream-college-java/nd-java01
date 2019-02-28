package com.nd.exception.demo01;

public class Person{
    String name;
    int age;

    public void add(int a, int b) throws ArithmeticException{//声明异常

        // 异常处理方式1:哪里有异常就在哪里处理（家里解决）
        System.out.println(a / b);
        //异常处理方式2:不在产生异常代码出处理，交给调用这处理。（告诉法院解决）
    }

  

}
