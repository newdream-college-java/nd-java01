package java13;
import java.util.Scanner;
public class CustomerBiz {
	String[] name=new String[4];
	public void showNames(String names){
		for(int i=0;i<name.length;i++){
			if(name[i]==null){
				name[i]=names;
				break;
			} 
		
		}
		
	}
	public void show(){
		String zm;
		
		do{
			Scanner input=new Scanner(System.in);
			System.out.print("������ͻ�����");
			String shuru=input.next();
			showNames(shuru);
			System.out.print("����������y/n");
			zm=input.next();
		}while(zm.equals("y"));
	}
	public void show1(){		
		System.out.print("**************************");
		System.out.print("�ͻ������б�");
		System.out.println("**************************");
		for(int i=0;i<name.length;i++){
			if(name[i]!=null){
				System.out.print(name[i]+"\t");
			}
		}
		
	}
	
	
}

