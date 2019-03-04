package zuoye;

import java.util.Scanner;

public class Foo {
	public void calc(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数值：");
		int i = input.nextInt();
		for(int p=0,num=0;p<i;p++){
			num++;
		}
		//System.out.println(num);
	}
	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.calc();

	}

}
