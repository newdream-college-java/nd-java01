/**
** �������1��1�յ������������
**/

public class Test07{
	public static void main(String[] args){
		int year=2019;
		int mont=2;
		//2019��1��1�յ�2��22��
		//1�µ�������+2�µ�22��
		int date=22;
		int i=1;
		int sum=0;
		while(i<7){
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
				sum+=31;
			}else if(i==2||i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				if((2019%4==0&&2019%100!=0)||(2019%400==0)){
					sum+=29;
				}else{
					sum+=28;
				}
			}
			i++;
		}
		sum+=22;
		System.out.println("��2019��1��һ�յ������������Ϊ"+sum);
	}
}