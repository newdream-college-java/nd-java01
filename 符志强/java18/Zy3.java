package ��ҵ;
import java.util.Scanner;

public class Zy3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int b=input.nextInt();
		System.out.println("������һ������");
		int c=input.nextInt();
		try {
			System.out.println(String.format("%d / %d = %d", b, c, b / c));
		} catch(ArithmeticException e) {
            System.out.println("��������Ϊ0");
            e.printStackTrace();      
        }catch(Exception e) {
            System.out.println(" �������͵��쳣");
        }finally {
            System.out.println("��лʹ�ñ�����");
        }
	}
}
