package test;
import java.util.Scanner;
public class Taa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		T1 a =new T1();
		for(int i=1;i<3;i++){
			System.out.println("�����뿨��");
			a.name=input.next();
			System.out.println("���������");
			a.jifen=input.nextInt();
			a.show();
		}
	}

}
