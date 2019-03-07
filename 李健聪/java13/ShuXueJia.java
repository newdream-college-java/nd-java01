package 第十三章作业;

public class ShuXueJia {
	public void s(int a,int b){
		if(a>b){
			System.out.println("最大值为："+a);
		}else{
			System.out.println("最大值为："+b);
		}
	}
	public void sh(int a){
		System.out.println(a+"的个位数为"+a%10);
	}
	public void sho(int a){
		System.out.println("a的立方为"+(a*a*a));
	}
	public int show(int a){
		int sum=0;
		if(a>0){
			for(int i=1;i<=a;i++){
				sum+=i;
			}
			
		}else{
			System.out.println("您的输入有误，请重新输入");
		}
		System.out.println(sum);
		return sum;
	}
}
