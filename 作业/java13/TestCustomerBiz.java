package ��13����ҵ;

import java.util.Scanner;

public class TestCustomerBiz {
	public static void main(String[] args) {
		CustomerBiz cb= new CustomerBiz();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<cb.cus.length;i++){
			Customer cu=new Customer();
			System.out.print("������ͻ�������");
			cu.name=input.next();
			cb.cus[i]=cu;
			System.out.print("���������𣿣�y/n��");
			String choice = input.next();
			if(choice.equals("n")){
				break;
			}
			if(i==cb.cus.length-1){
				System.out.println("�ռ�����");
				break;
			}
		}
		cb.show();
	}
}
