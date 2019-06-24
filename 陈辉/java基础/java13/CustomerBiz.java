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
			System.out.print("请输入客户姓名");
			String shuru=input.next();
			showNames(shuru);
			System.out.print("继续输入吗y/n");
			zm=input.next();
		}while(zm.equals("y"));
	}
	public void show1(){		
		System.out.print("**************************");
		System.out.print("客户姓名列表");
		System.out.println("**************************");
		for(int i=0;i<name.length;i++){
			if(name[i]!=null){
				System.out.print(name[i]+"\t");
			}
		}
		
	}
	
	
}

