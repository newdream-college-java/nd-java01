package com.nd.exception.demo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        
        while(true) {
            Scanner in = new Scanner(System.in);
            try {
                
                System.out.print("请输入被除数:");
                int num1 = in.nextInt();
                System.out.print("请输入除数:");
                int num2= in.nextInt();
              
                System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
                //程序执行到这里，还没有产生异常-----终止循环
               // break;
                return ;
              /*
               * e:当程序产生异常的时候，系统会将异常的信息（什么类型的异常，异常在哪一行，
               * 堆栈信息等等）封装到一个Exception类或其子类的对象上（e）,然后将这个对象传递给catch
               * 
               * 产生的：ArithmeticException类型异常
               */
            } catch (ArithmeticException e) {
                //进行异常处理----1，中止程序（不推荐） 2，进行提示/并要求用户重新操作（推荐）
               System.out.println("输入的除数不能为0,   请重新输入");
               //System.out.println(e);//调用Exception这个类的toString
               //System.out.println(e.toString());//打印异常类或者异常类+异常的原因
              // System.out.println(e.getMessage());//打印异常的原因
               e.printStackTrace();//打印异常类，原因，堆栈信息，异常所产生的行
               //System.exit(1);//主动终止程序。不推荐
               return;//作用：1，退出方法，2:返回值数据
              
            }catch(InputMismatchException e) {
                System.out.println("输入不匹配题");
            }catch(Exception e) {
                System.out.println(" 其他类型的异常");
            }finally {
                System.out.println("我是不管程序是否产生异常，都要被执行的代码......");
            }
        }
      
       // System.out.println("感谢使用本程序！");
    }
}
