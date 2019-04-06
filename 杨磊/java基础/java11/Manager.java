package zuoye;

public class Manager {
	String manager;
	int passWord;
	public int show(){
		System.out.println("管理员为："+manager+"密码为："+passWord);
		return passWord;
	}
}
