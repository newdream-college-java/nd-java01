package com.nd.exception.demo01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = in.nextInt();
        System.out.print("请输入除数:");
        int num2=-1;
        if(in.hasNextInt()) {
            num2 = in.nextInt();
            if(num2==0) {
                //处理 1，提示用户重新输入，2，中止程序
                //输出的内容文字颜色为红色
                System.err.println("输入的整数不能为0");
              
            }
        }
        System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
        System.out.println("感谢使用本程序！");
    }
}
