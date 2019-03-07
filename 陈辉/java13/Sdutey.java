package java13;
import java.util.Scanner;
public class Sdutey {
	String[] name=new String[5];
	public void showNames(String names){
		for(int i=0;i<name.length;i++){
			if(name[i]==null){
				name[i]=names;
				break;
			} 
		}	
	}
	String zm;
	public void show(){
		for(int i=0;i<name.length;i++){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入客户姓名");
			zm=input.next();
			showNames(zm);
		}
	}
	public void show1(){
		System.out.println("********************************");
		System.out.println("客户姓名列表：");
		System.out.println("********************************");
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]);
		}
	}
	public void show2(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你要修改的客户姓名");
		zm=input.next();
		System.out.println("请输入新的客户姓名");
		String mz=input.next();
		System.out.println("*****修改结果");
		for(int i=0;i<name.length;i++){
			if(name[i].equals(zm)){
				name[i]=mz;
				System.out.println("修改成功！！！");
				break;
			}else{
				System.out.println("修改失败！！！");
				
			}	
			
		}
	}
	public void show3(){
		System.out.println("******************************");
		System.out.println("\t\t客户姓名列表");
		System.out.println("******************************");
		show1();
	}
}
