import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������Ҫ�����������");
		int sr=input.nextInt();
		if(sr<3){
			System.out.print("������"+sr+"������");
		}else if(sr>=3&&sr<=5){
			sr+=1;
			System.out.print("������"+sr+"������");
		}else if(sr>5){
			sr+=2;
			System.out.print("������"+sr+"������");
		}
	}
}