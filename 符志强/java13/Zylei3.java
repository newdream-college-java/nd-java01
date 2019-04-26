package zuoye;

import java.util.Scanner;

public class Zylei3 {
	/*保存所有学生的名字*/

	String[] names=new String[5];
	/*方法的命名规则：小驼峰（首字母小写，后面每个单词首字母大写）
	 * 类的命名规则：大驼峰
	 * 变量的命名规则：小驼峰
	 * 使用有参数方法来定义添加名字的方法。要求调用者必须在调用方法时候传递一个学生
	 * */
	public void b(String name){
		//找到数组中元素为null的下标
		for (int i = 0; i < names.length; i++) {
			if(names[i]==null){
				//再将name放到下标位置
				names[i]=name;
				break;
			}		
		}
	}
	public void s(){
		System.out.println("************************************");
		System.out.println("\t\t客户名字列表：");
		System.out.println("************************************");
		for (int i = 0; i <names.length; i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println();
	}
	
public boolean a(int b,int c){//返回boolean       带有三个形参
	boolean f=false;
	//指定区间数组中，查找姓名
	Scanner input=new Scanner(System.in);
	System.out.print("请输入要更改的客户姓名：");
	String name=input.next();
	for(int i=b-1;i<c;i++){
		if(names[i].equals(name)){
			//Scanner input=new Scanner(System.in);
			System.out.print("请输入新的客户姓名:");
			String shuru=input.next();
			System.out.println("**********修改结果*********");
			System.out.println("找到并修改成功");
			names[i]=shuru;
			s();
			f=true;
			break;
		}
	}
	
	return f;//返回boolean类型
	}
}