import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�ϰ�����Ҫ��");
		int sum=input.nextInt();
		int a=1,b=2,c;
		if(sum>=3&&sum<=5){
			c=sum+a;
			System.out.println("�ϰ�������1��������򵽣�"+c);
		}else if(sum>5){
			c=sum+b;
			System.out.println("�ϰ�������2��������򵽣�"+c);
		}else {
			System.out.println("�ϰ岻������");
			}	
	}
}