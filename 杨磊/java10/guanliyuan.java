package zuoye;
import java.util.*;
public class guanliyuan {
	Scanner input = new Scanner(System.in);
	String name;
	int passWord;
	public void show(){
		System.out.print("������"+name+"��");	
		System.out.print("����"+passWord);
		System.out.println();
	}
	public void pan(){
		System.out.println("�������û�����");
		String b=input.next();
		System.out.println("��������λ���룺");
		int a=input.nextInt();
		if(a==this.passWord){
			System.out.println("������������");
			passWord=input.nextInt();
			System.out.println("�޸ĳɹ������������Ϊ"+passWord);
		}else{
			System.out.println("��������㲻֪��������ĸ����ӣ�");
		}
	}
}
