package ��ҵ;
import java.util.Scanner;

public class Zy5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a=new int[5];
		try {			
			for (int i = 0; i <=a.length; i++) {
				System.out.println("�������������ֵ");
				a[i]=input.nextInt();
			}				
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
        }catch(Exception e) {
        	System.out.println(" �������͵��쳣");
        }
	}
}
