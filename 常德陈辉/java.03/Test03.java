/*����һ����ݣ���������꣬�������һ�������꣬���������һ����ƽ�ꡣ���꣺����ܱ�4�������Ҳ��ܱ�100�����������ܱ�400����*/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ�����");
		int year=input.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.print(year+"������");
		}else{
			System.out.print(year+"��ƽ��");
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                