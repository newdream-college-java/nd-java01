import java.util.Scanner;
public class hw02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year= input.nextInt();
		if((year%4==0)&&(year%100!=0)||year%400==0){
			System.out.print("��һ�������꣡");
			}else{
			System.out.print("��һ����ƽ�꣡");
			}
	}


}