package 第13章作业;

public class MathPerson {
	public String calculate(int a,int b){
		if(a>b){
			return "最大值为："+a;
		}else{
			return "最大值为："+b;
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
		return "个位数是"+i;
	}
	public String calculate1(int a){
		return "这个数的立方是"+a*a*a;
	}
	public String calculate2(int a){
		int sum=0;
		for(int i=1;i<=a;i++){
			sum+=i;
		}
		return "结果为："+sum;
	}
}
