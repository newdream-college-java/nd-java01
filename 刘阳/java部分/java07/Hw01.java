import java.util.Scanner;
public class Hw01{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int num,sum=1;
		System.out.println("������һ����������1~10����");
		num=input.nextInt();
		int a=num;
		if(num>=1&&num<=10){
			for(;num>=1;num--){
				sum*=num;
			}
			System.out.print(a+"�Ľ׳˵��ڣ�"+sum);
		}else{
			System.out.print("���������������Ϲ涨������");
			System.exit(-1);
		}
	}
}
