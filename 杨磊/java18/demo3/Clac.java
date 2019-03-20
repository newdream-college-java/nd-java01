package com.nd.yl.demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Clac {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Clac.class);
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("请输入被除数：");
			int a = input.nextInt();
			System.out.println("请输入除数：");
			int b = input.nextInt();
			System.out.println(a + "/" + b + "=" + a / b);
		} catch (InputMismatchException e) {
			log.error(e + "被除数都除数都必须为整数。");
		} catch (ArithmeticException e) {
			log.warn(e + "除数不能为0");
		} catch (Exception e) {
			log.error(e);
		} finally {
			System.out.println("感谢使用本程序！");
		}

	}
}
