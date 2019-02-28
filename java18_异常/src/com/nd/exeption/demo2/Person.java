package com.nd.exeption.demo2;

import org.apache.log4j.Logger;

/*
 * java中定义的异常，一旦异常发生，java虚拟机会主动抛出这个异常
 * 但是像：
 *      如果在person类中，age的值大于150或者小于0  抛出一个异常。
 *      这种异常java虚拟机不会抛出，需要程序员自己抛出异常？
 *      通过：throw new 异常类(异常信息);
 */
public class Person {
    static Logger loger =  Logger.getLogger(Person.class);
    int age; 
    public void setAge(int age) {//throws Exception{
        if(age>150||age<0) {
            //抛出一个异常？
            try {
                throw new Exception("年龄不能小于0，或年龄不能大于150");//告诉虚拟机有有异常产生
            } catch (Exception e) {
                System.out.println(e.getMessage()+" -------这是传给我的异常信息");
            }
          //  throw new Exception();//告诉虚拟机有有异常产生
        }
        this.age = age;
        
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(100);
        
    }
}
