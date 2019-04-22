
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager a=new Manager();
		a.t=1;
		for (int i = 0; i < a.t; i++) {	
			System.out.println("管理员信息用户名为："+a.showName(i)+"\t密码为："+a.showMm(i));
		}
	}

}
