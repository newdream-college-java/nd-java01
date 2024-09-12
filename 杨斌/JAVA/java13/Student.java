import java.util.Scanner;
public class Student {
	String[] names=new String[5];
	public void show(String name){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void showNames(){
		System.out.println("******************************");
		System.out.println("\t客户姓名列表");
		System.out.println("******************************");
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
	}
	public void gg(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n请输入要修改的客户姓名:");
		String n=input.next();
		System.out.print("\n请输入新的客户姓名:");
		String q=input.next();
		System.out.println("****修改结果****");
		boolean flag=false;
		for(int i=0;i<names.length;i++){
			if(names[i].equals(n)){
				flag=true;
				names[i]=q;
				System.out.println("找到并修改成功");
				showNames();
				break;
			}			
		}
		if(!flag){
			System.out.println("没有找到你输入的客户姓名");
		}
		
		
	}
}