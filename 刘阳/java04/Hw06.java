//计算2019年1月1日到2月22日（今天）的总天数。
public class Hw06{
	public static void main(String[] args){
		int sum =0;
		int i =1;//表示月份
		while(i<2){
			if(i==2){
			//如果2019年是闰年
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
		System.out.print("总天数为："+sum);		
	}
}