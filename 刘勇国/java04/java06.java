import java.util.Scanner;
public class java06{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum=0;
	int xy=0;
	int dy=0;
	System.out.println("�������������");
	int year = input.nextInt();
	System.out.println("�����������·�");
	int month = input.nextInt();
	System.out.println("��������������");
	int day = input.nextInt();
	//����
	if((year%4==0&&year%100!=0)||(year%400==0)){
		System.out.println("���������꣬2����29��");
		if(month>2){
			for(int i=1;i<month;i++){
				if(i==1||i==3||i==5||i==7||i==8||i==10)//���¹���xy��
				dy+=1;
			}
			System.out.println("�����칲��"+(30*(month-1)+day+dy-1));
		}else if(month==1){
			System.out.println("�����칲��"+day+"��");
		}else if(month==2){
			System.out.println("�����칲��"+(31+day)+"��");
		}
	}else{
		System.out.println("������ƽ��");
		if(month>2){
			for(int i=1;i<month;i++){
				if(i==1||i==3||i==5||i==7||i==8||i==10)//���¹���xy��
				xy+=1;
			}
			System.out.println("�����칲��"+(30*(month-1)+day+xy-2)+"��");
		}else if(month==1){
			System.out.println("�����칲��"+day+"��");
		}else if(month==2){
			System.out.println("�����칲��"+(31+day)+"��");
		}
	}
	}
}