package zuoye;

import java.util.Scanner;

public class Work6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int sum=0,count=0;
		for(int i=0;i<10;i++){
			System.out.println("�����"+(i+1)+"������");
			 a[i]=input.nextInt();
			 if(a[i]==1||a[i]==2||a[i]==3){
				 count++;
			 }else{
				 sum++;
			 }
		}
		System.out.println("������"+count+"�����Ƿ�������"+sum);
	}

}
