/**
**���100-999֮���ˮ�ɻ����������磺ˮ�ɻ��� 153=1*1*1+5*5*5+3*3*3��
**/

public class Test05{
	public static void main(String[] args){
		int a=-1;
		int b=-1;
		int c=-1;
		for(int i=100;i<=999;i++){
			a=i%10;
			b=i/10%10;
			c=i/100;
			if(i==(a*a*a+b*b*b+c*c*c)){
				System.out.println(i+"��ˮ�ɻ���");
			}
		}
	}
}