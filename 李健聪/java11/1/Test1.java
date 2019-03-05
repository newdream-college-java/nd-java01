package shiyizhang;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mannager mg=new mannager();
		mg.t=5;
		for(int i=0;i<mg.t;i++){
			System.out.print("管理员信息用户名为:"+mg.xsname(i));
			System.out.println("\t管理员密码为:"+mg.xspassword(i));
		}
		
	}

}
