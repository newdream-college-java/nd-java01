package ��13����ҵ;

public class MathPerson {
	public String calculate(int a,int b){
		if(a>b){
			return "���ֵΪ��"+a;
		}else{
			return "���ֵΪ��"+b;
		}
	}
	public String calculate(int a){
		int i;
		for(i=a;i>10;){
			if(i==10){
				i=0;
			}else{
				i=i%10;
			}
		}
		return "��λ����"+i;
	}
	public String calculate1(int a){
		return "�������������"+a*a*a;
	}
	public String calculate2(int a){
		int sum=0;
		for(int i=1;i<=a;i++){
			sum+=i;
		}
		return "���Ϊ��"+sum;
	}
}
