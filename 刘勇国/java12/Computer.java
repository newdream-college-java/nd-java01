package �˻���ȭ2;

import java.util.Random;

public class Computer {
	String name;
	int score;
	int chuQuan=-1;
Random rd = new Random();
public void fun(){
	
	chuQuan = rd.nextInt(2)+1;
	switch(chuQuan){
		case 1:
			System.out.println("���Գ��ļ���");
			break;
		case 2:
			System.out.println("���Գ���ʯͷ");
			break;
		case 3:
			System.out.println("���Գ��Ĳ�");
			break;
	}
} 
}
