import java.util.Scanner;
public class StartSMS {
	String user,password;
	public void show(){
		Menu mu=new Menu();
		Scanner input=new Scanner(System.in);
		System.out.print("�������û�����");
		user=input.next();
		System.out.print("���������룺");
		password=input.next();
		if(user.equals("newdream")&&password.equals("0000")){
			mu.showMainMenu();
		}else{
			System.out.print("@@��û��Ȩ�޽���ϵͳ�������µ�¼.@@");
			
		}
	}
	
}
