import java.util.Scanner;
public class java02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("����һ����ݣ�");
		int y=input.nextInt();
		if(y%4==0&&y%100!=0||y%400==0){

			System.out.print("����");
		}else{

			System.out.print("ƽ��");
		}

		
	}



}