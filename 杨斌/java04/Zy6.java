import java.util.Scanner;
public class Zy6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("���������Ϊ����");
		int y=input.nextInt();
		System.out.println("���������Ϊ����");
		int a=input.nextInt();
		System.out.println("���������Ϊ����");
		int b=input.nextInt();	
		int sum=0;
		int i=1;
		while(i<a){
			if(i==2){
				if(y%4==0&&y%100!=0||y%400==0){

					sum+=29;
				}else{
					sum+=28;
				}
			
			}else if(i==2||i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}

			i++;

		}
		sum=sum+b;
		System.out.print("������Ϊ��"+sum);


	}

}