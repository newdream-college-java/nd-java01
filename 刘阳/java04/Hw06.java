//����2019��1��1�յ�2��22�գ����죩����������
public class Hw06{
	public static void main(String[] args){
		int sum =0;
		int i =1;//��ʾ�·�
		while(i<2){
			if(i==2){
			//���2019��������
			if(2019%4==0&&2019%100!=0||2019%400==0){
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
		sum+=22;
		System.out.print("������Ϊ��"+sum);		
	}
}