package zuoye;

import java.util.Arrays;

public class Work3 {

	public static void main(String[] args) {
		char[] a={'a','c','u','b','e','p','f','z'};//����һ��8��Ԫ�ص�����
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}//ѭ���������
		System.out.println();
		Arrays.sort(a);//����
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}//���
		for(int i=0;i<a.length;i++){
			 for(int j=0;j<a.length-1-i;j++){
				 if(a[j]<a[j+1]){
					 char temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
		}//ð��������
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}//���
	}

}
