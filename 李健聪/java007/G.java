import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0,day=0;
		System.out.println("��������Ҫ�鿴�����");
		int year=input.nextInt();
		System.out.println("��������Ҫ�鿴���·�");
		int month=input.nextInt();
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
		}sum++;
		System.out.println(year+"��"+month+"��1��������"+sum%7);
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		
		
			if(month==2){
				if(year%4==0&&year%100!=0||year%400==0){
					day=29;
				}else{
					day=28;
				}
			}else if(month==4||month==6||month==9||month==11){
				day=30;
			}else{
				day=31;
			}
		
		for(int i=1;i<=day;i++){
			System.out.print(i+"\t");
		if((sum+i)%7==0){
			System.out.print("\n");
		}

		}




	}
}