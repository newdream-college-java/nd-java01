import java.util.Scanner;
public class Z2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);		
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"��ͬѧ�ɼ�");
			int a=input.nextInt();
			if(a<=80){
				continue;
			}
			sum++;
		}
		System.out.print("��"+sum+"��ͬѧ�ɼ�����85��");
	}
}