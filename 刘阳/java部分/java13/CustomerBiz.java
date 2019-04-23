package zuoye;
import java.util.Scanner;
public class CustomerBiz {
	String name;
	String[] names=new String[4];
	String xuanze;
	int i=0;
	public void addname(){
		Scanner input=new Scanner(System.in);
			//提示输入客户姓名
		System.out.print("请输入客户的姓名："+"\n");
		name=input.next();
		choice();
	}
	public void choice(){
		Scanner input=new Scanner(System.in);
		names[i]=name;
		//询问选择
		System.out.print("继续输入吗？（y/n）：");
		System.out.println(" ");
		xuanze=input.next();
		if(i<names.length-1){
			if("y".equals(xuanze)){
				i++;
				addname();
			}else if("n".equals(xuanze)){
				showname();
			}
		}else{
			System.out.println("输入已达上限，不再接受输入，显示客户姓名列表");
			showname();
		}
	}
	public void showname(){
		System.out.println("************************************");
		System.out.println("\t\t客户姓名列表：\t\t");
		System.out.println("************************************\n");
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]="空";
			}
		}
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+"\t");
		}
		System.exit(-1);
	}
}
