import java.util.Scanner;
public class Zy2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������˶��ٸ��ң�\n");
		int a=input.nextInt();
		if(a>5){
			a=a+2;
		
		}else if(3<=a&&a<=5){
			a=a+1;
		}

		System.out.print("�������"+a+"����");

	}
	




}