package �˻���ȭ;

import java.util.Scanner;

public class Test2 {
	String name1="����";	
	int score;
	public int renC(){
		Scanner input=new Scanner(System.in);
		 int choices = -1;
	        if(input.hasNextInt()) {
	            choices  = input.nextInt();
	        }
		switch(choices){
			case 1:
				System.out.println(name1+"��ȭ��ʯͷ");
				break;
			case 2:
				System.out.println(name1+"��ȭ������");
				break;
			case 3:
				System.out.println(name1+"��ȭ����");
				break;
			default:
				System.out.println("�ף���������");
				break;
				
		}
		System.out.println();
		return choices;
	}
	
}
