import java.util.Scanner;
public class A01{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		//System.out.print("������5��ͬѧ�ĳɼ�");
		//int b =input.nextInt();
		int sum=0;//��������80������		
		for(int i=1;i<6;i++){
		    //sum=0;//����80������
			System.out.print("�������"+i+"ͬѧ�ĳɼ�");
			int b = input.nextInt();//�������
			if(b>80){
				sum++;
			}
			
		}System.out.println("����80������Ϊ��"+sum);
	}
}