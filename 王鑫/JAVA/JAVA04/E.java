// �ж����������������һ��ĵڶ�����

import java.util.Scanner;

public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("�����������գ�");
		int year = input.nextInt(),month =input.nextInt(),day=input.nextInt(),sum=0;
		if(year%4==0&&year%100!=0||year%400==0){
		sum+=1;
		}
		switch(month-1){
		case 1:	
			sum+=31;
			break;
		case 2:	
			sum+=59;
			break;
		case 3:	
			sum+=90;
			break;
		case 4:	
			sum+=120;
			break;
		case 5:	
			sum+=151;
			break;
		case 6:	
			sum+=181;
			break;
		case 7:	
			sum+=212;
			break;
		case 8:	
			sum+=243;
			break;
		case 9:	
			sum+=273;
			break;
		case 10:	
			sum+=304;
			break;
		case 11:	
			sum+=334;
			break;
		}
		System.out.print(year+"��"+month+"��"+day+"�չ���"+(sum+day)+"��");
	}
}