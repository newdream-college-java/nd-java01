import java.util.Scanner;
public class Java07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���������");
		int year = input.nextInt();
		System.out.println("�������·�");
		int month = input.nextInt();
		int sum=1; //��ʼ��0��
		int days=0;
		int date=0;
		//������������
		for(int i=1990;i<year;i++){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//����������  �����yearΪ����
		if(year%4==0&&year%100!=0||year%400==0){
			for(int i=1;i<month;i++){
				if(i==1||i==3||i==5||i==7||i==8||i==10){
					sum+=31;
				}else if(i==2){
					sum+=29;
				}else{
					sum+=30;
				}
			}
		}else{
			//ƽ��
			for(int i=1;i<month;i++){
				if(i==1||i==3||i==5||i==7||i==8||i==10){
					sum+=31;
				}else if(i==2){
					sum+=28;
				}else{
					sum+=30;
				}
			}
		}
		System.out.print("��\tһ\t��\t��\t��\t��\t��\n");
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}else{
			days=31;
		}
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.print("\n");
			}
			sum++;
		}
	}
}