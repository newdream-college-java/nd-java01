import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=0;
		for(int i=1;i<6;i++){
			System.out.println("�������"+i+"��ͬѧ�ĳɼ���");
			int sum=input.nextInt();
			if(sum<=80){
				continue;
			}
			a++;
		}
		System.out.println("����80�ֵ�ͬѧ�У�"+a+"��");
	}
}