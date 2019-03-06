import java.util.Scanner;


public class Testjisuanji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入运算数字：");
		double a=input.nextDouble();
		System.out.print("请输入被运算数字：");
		double b=input.nextDouble();
		System.out.print("请选择运算方法+，-，*，/：");
		String c=input.next();
		Calculator yx=new Calculator();
		yx.num1=a;
		yx.num2=b;
		if(c.equals("+")){
			System.out.print("结果为："+yx.showAdd());
		}else if(c.equals("-")){
			System.out.print("结果为："+yx.showMinus());
		}else if(c.equals("*")){
			System.out.println("结果为："+yx.showMultiple());
		}else if(c.equals("/")){
			System.out.println("结果为："+yx.showDivide());
		}else{
			System.out.println("输入错误！");
		}
	}

}
