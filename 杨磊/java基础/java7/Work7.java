import java.util.Scanner;
public class Work7{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		//1.ȷ���꣬�£����룩
		//int year=2019;
		System.out.print("��������Ҫ������������ݣ�");
		int year  = input.nextInt();
		//int month = 2;
		System.out.print("��������Ҫ�鿴���·ݣ�");
		int month = input.nextInt();
		
		int sum = 0;
		//2.����������=���������+���µ�����+1
		//2.1����������1900+1901+....+1902+....+2017
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){//����
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//2.2����������2018��1��+2��+3��+....+12
		for(int i=1;i<month;i++){
			if(i == 2){//2��
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){//С��
				sum+=30;
			}else{//����
				sum+=31;
				
			}
		}
		//2.3 1�ŵ�һ�죬�ǵü���1
		sum+=1;
		//2.4 �õ�1�������ڼ�
		System.out.println(sum%7);
		
		//��ӡ���������ı�ͷ
		System.out.println("\t\t"+year+"��"+month+"��\n");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");


		//��ӡ������
		//4.1 ȷ��1�ŵ�λ�ã�һ�������ڼ�����ǰ���ӡ���ٸ�\t
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//4.2�ж�������ж�����
		int days = 0;
		if(month == 2){//2��
			if(year%4==0&&year%100!=0||year%400==0){
				days+=29;
			}else{
				days+=28;
			}
		}else if(month==4||month==6||month==9||month==11){//С��
				days+=30;
		}else{//����
			days+=31;		
		}	
		//�������
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.print("\n");
			}
			sum++;
		}
	}
}