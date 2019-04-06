package com.nd.yl.demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Clac {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Clac.class);
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("�����뱻������");
			int a = input.nextInt();
			System.out.println("�����������");
			int b = input.nextInt();
			System.out.println(a + "/" + b + "=" + a / b);
		} catch (InputMismatchException e) {
			log.error(e + "������������������Ϊ������");
		} catch (ArithmeticException e) {
			log.warn(e + "��������Ϊ0");
		} catch (Exception e) {
			log.error(e);
		} finally {
			System.out.println("��лʹ�ñ�����");
		}

	}
}
