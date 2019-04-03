package com.song;

public class CalculatorTest {
	public static void main(String[] args) {
			Calculator calculator=new Calculator();
			calculator.num1=200;
			calculator.num2=5;
			System.out.println(calculator.num1+"+"+calculator.num2+"="+calculator.add());
			System.out.println(calculator.num1+"-"+calculator.num2+"="+calculator.minus());
			System.out.println(calculator.num1+"*"+calculator.num2+"="+calculator.multiple());
			System.out.println(calculator.num1+"/"+calculator.num2+"="+calculator.divide());
	}
}
