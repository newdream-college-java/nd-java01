import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int mun=input.nextInt();
		if(mun%4==0&&mun%100!=0||mun%400==0){
			System.out.println(mun+"��һ��������");
		}else{
			System.out.println(mun+"��һ����ƽ��");
			}
	}
}