package com.nd.exception.demo01;

public class Test03 {
    public static void main(String[] args){
        Person p = new Person();
        //异常（最终还是推荐由程序员通过try处理，不要往系统抛出异常）
        try {
            p.add(3, 0);
        } catch (Exception e) {
              //处理
        }
      
      
        System.out.println(p);// 默认调用Person类的toString
    }
}
