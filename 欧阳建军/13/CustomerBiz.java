package 第13章作业;

import java.util.Scanner;

public class CustomerBiz {
	Customer[] cus = new Customer[5];
	String choice="y";
	public void menu(Customer cu){
		Scanner input =new Scanner(System.in);
		for(int i=0;i<cus.length;i++){
			if(cus[i]==null){
				cus[i]=cu;
				break;
			}else{
				System.out.println("录入信息失败，已储存满");
			}
		}
	}
	public void show(){
		System.out.println("******************************\n\n\t客户姓名列表：");
		System.out.println("******************************");
		for(int i=0;i<cus.length;i++){
			if (cus[i]!=null) {
				//如果这里不做判断就会产生空指针吟唱
				System.out.print(cus[i].name+"\t");
			}
			
		}
	}
}
