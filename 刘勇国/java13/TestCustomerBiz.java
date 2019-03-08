package 第13章作业;

import java.util.Scanner;

public class TestCustomerBiz {
	public static void main(String[] args) {
		CustomerBiz cb= new CustomerBiz();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<cb.cus.length;i++){
			Customer cu=new Customer();
			System.out.print("请输入客户姓名：");
			cu.name=input.next();
			cb.cus[i]=cu;
			System.out.print("继续输入吗？（y/n）");
			String choice = input.next();
			if(choice.equals("n")){
				break;
			}
			if(i==cb.cus.length-1){
				System.out.println("空间已满");
				break;
			}
		}
		cb.show();
	}
}
