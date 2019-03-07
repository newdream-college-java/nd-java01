package 第十三章作业;

public class Dk {
	public Dk(int a,int b){
		double lx=0.01;
		
		System.out.println("您好欢迎来到贷款公司");
		System.out.println("您的贷款金额为:"+a+"元");
		double yhk=(a+a*lx*b)/b;
		System.out.println("您每个月需要还"+yhk+"元");
		
	}
}
