import java.util.Scanner;
public class T9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("���������ĳɼ�");
		double score=input.nextDouble();
		if(score>=80){
			System.out.println("��ĳɼ�������");
		}else if(score>=60){
			System.out.println("���ĳɼ�һ���");
		}else 	System.out.println("���ĳɼ�������");
	}
}