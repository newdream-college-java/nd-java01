package java11;
import java.util.Scanner;
public class Y2 {
	String name;
	String mima;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println();
		System.out.println("1��¼ϵͳ");
		System.out.println();
		System.out.println("2�˳�");
		System.out.println("��ѡ���������֣�");
		int a=0;
		a =input.nextInt();
		if(a==1){
			System.out.println("��ӭ�������˵�");
		}
	}
	public void dan(){
		Scanner input=new Scanner(System.in);
		System.out.println("1�ͻ�����ϵͳ");
		System.out.println("2�������");
		System.out.println("��ѡ�������0������һ���˵���");
		int b =0;
		b =input.nextInt();
		if(b==2||b==0){
			System.out.println("������һ���˵�");
		}
	}
	public void hui(){
		Scanner input=new Scanner(System.in);
		System.out.println("1:���˴����");
		System.out.println("2:���˳齱");
		System.out.println("3:�����ʺ�");
		System.out.println("��ѡ�������0������һ���˵���");
		int c =0;
		c =input.nextInt();
		if(c==1||c==0){
			System.out.println("������һ���˵�");
		}
		int k=3;
		switch(k){
		 	case 1:
		 		System.out.println("���˴����");
		 	case 2:
		 		System.out.println("���˳齱");
		 	case 3:
		 		System.out.println("�����ʺ�");		 	
		}
		
	}

}	
		
	
