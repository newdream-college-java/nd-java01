import java.util.Scanner;


public class Testjisuanji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("�������������֣�");
		double a=input.nextDouble();
		System.out.print("�����뱻�������֣�");
		double b=input.nextDouble();
		System.out.print("��ѡ�����㷽��+��-��*��/��");
		String c=input.next();
		Calculator yx=new Calculator();
		yx.num1=a;
		yx.num2=b;
		if(c.equals("+")){
			System.out.print("���Ϊ��"+yx.showAdd());
		}else if(c.equals("-")){
			System.out.print("���Ϊ��"+yx.showMinus());
		}else if(c.equals("*")){
			System.out.println("���Ϊ��"+yx.showMultiple());
		}else if(c.equals("/")){
			System.out.println("���Ϊ��"+yx.showDivide());
		}else{
			System.out.println("�������");
		}
	}

}
