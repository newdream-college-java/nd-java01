package Test2019_3_5;

public class Manager {
	//��һ��
	String[] name = {"newdream","newdream2","newdream3","newdream4"};
	String[] password = {"0000","0002","0003","0004"};
	//�ڶ���
	String name2 = "admin";
	String password2 = "123456";
	
	//��һ��
	int t=0;
	public String showName(int i){
			return name[i];
	}
	public String showPassword(int i){
			return password[i];
	}
	
}
