package com.song;
/**
 * 编写Calcalator类
 * 1.定义成员变量运算数1（num1）和运算数2（num2）
 * 2.实现成员方法"加"（add）、"减"（minus）、"乘"（multiple）、"除"（divide）
 * @author mo
 *
 */
public class Calculator {
		double num1;
		double num2;
		public double add() {
			return num1+num2;
		}
		public double minus() {
			return num1-num2;
		}
		public double multiple() {
			return num1*num2;
		}
		public double divide() {
			return num1/num2;
		}
}
