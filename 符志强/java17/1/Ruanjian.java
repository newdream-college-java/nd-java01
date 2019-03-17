package 作业;

public class Ruanjian extends Z1 implements Bianma,Yeiwu {
	@Override
	public void f(){
		System.out.println("我是软件工程师，我叫小明");
	}
	public void bianma() {
		// TODO Auto-generated method stub
		System.out.println("我会编码");
	}
	@Override
	public void yeiwu() {
		// TODO Auto-generated method stub
		System.out.println("我会业务");
	}
}
