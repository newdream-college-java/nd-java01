package 第17章接口程序员1_1作业;

public class SoftEngineer extends Programmer implements WriteCode,IntroduceBusiness {
	private String job;
	@Override
	public void showMyJob() {
		job="软件工程师";
		// TODO Auto-generated method stub
		System.out.println("我是一名"+job+"我的名字叫"+getName());
		
	}
	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
		System.out.println("我会写代码");
		
	}
	@Override
	public void introduceBusiness() {
		// TODO Auto-generated method stub
		System.out.println("我会讲业务");
		
	}
	
}
