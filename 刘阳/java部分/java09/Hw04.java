import java.util.Arrays;
import java.util.Scanner;
public class Hw04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i;
		char[] str= {'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		Arrays.sort(str);
		System.out.println("\n");
		System.out.print("���������");
		for(i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println("\n");
		System.out.print("������һ���ַ�:");
		String zm=input.next();
		char c=zm.charAt(0);
		char[] arr=new char[9];
		//����һ���µ����飬��ԭ���鳤�ȴ�1��Ȼ���ԭ����Ԫ�ظ��Ƶ�ǰ8��λ��.
		for(i=0;i<str.length;i++){
			arr[i]=str[i];
		}
		//ȷ��Ҫ�����λ��
		int index=0;
		for(i=0;i<arr.length;i++){
			if(arr[i]>c){
				index=i;
				break;
			}
		}
		//�Ӳ���λ�ÿ�ʼ����������һ��λ�ã�˳���Ĭ��ֵ���滻���ǵ�
		for(i=arr.length-2;i>=index;i--){
			arr[i+1]=arr[i]; 
		}
		arr[index]=c;
		System.out.println("\n");
		System.out.print("�����ַ�����ַ����У�");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.print("�����λ���ǣ�"+index);
	}

}