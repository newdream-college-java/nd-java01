package ��18���쳣��ҵ1_5;

import java.util.Scanner;

public class OutOfBounds {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[] arr=new int[3];
		try{
			for(int i=0;i<=arr.length;i++){
				System.out.println("�������"+(i+1)+"������");
				arr[i]=input.nextInt();
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Խ���쳣");
			System.out.println(e.getStackTrace());
		}
	}
}
