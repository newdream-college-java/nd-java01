import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������");
		int year=input.nextInt();
		System.out.println("�����·�");
		int smonth=input.nextInt();
		System.out.println("��������");
		int date=input.nextInt();
		int sum=0;
		int i=smonth;
		while(i<=smonth){
			if(i==2){
				if(year%4==0&&year%100!=0||2019%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
			i++;
		}
		sum=sum+date;
		System.out.println("����һ��һ�ŵ������������Ϊ��"+sum);
		

	}
}