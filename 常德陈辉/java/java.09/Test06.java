/*�Ӽ���������10���������Ϸ�ֵΪ1��2��3��������3������Ϊ�Ƿ����֡����ͳ��ÿ�������ͷǷ����ֵĸ���*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
		int a=10;
		int b=0,c=0;
		int[] arr=new int[a];
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"��������");
			arr[i]=input.nextInt();
			if(arr[i]==1||arr[i]==2||arr[i]==3){
				b++;
			}else{
				c++;
			}
		}
		System.out.print("�Ϸ�ֵ�У�"+b+"��\t�Ƿ������У�"+c+"��");
	}
}