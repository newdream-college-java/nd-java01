import java.util.Arrays;
import java.util.Scanner;


public class zuoye33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char arr[]={'a','c','u','b','e','p','f','z'};
		char[] brr=new char[9];
		int t=0;
		System.out.print("ԭ�ַ�����Ϊ:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.print("�������ַ�����Ϊ:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			brr[i]=arr[i];
		}
		System.out.println();
		System.out.print("�����һ���µ��ַ�:");
		String a=input.next();
		char c=a.charAt(0);//��ȡ�ַ���a�ĵ�һ���ַ������丳ֵ���ַ�����c�� 
		brr[8]=c;
		Arrays.sort(brr);
		System.out.println();
		System.out.print("�����ַ��������Ϊ��");
		for(int i=0;i<brr.length;i++){
			if(brr[i]==c){
				t=(i+1);
			}
			System.out.print(brr[i]+" ");
		}
		System.out.println("������ַ�λ��Ϊ"+t);
		
	}

}
