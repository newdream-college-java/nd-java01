package ��13����ҵ;

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
				System.out.println("¼����Ϣʧ�ܣ��Ѵ�����");
			}
		}
	}
	public void show(){
		System.out.println("******************************\n\n\t�ͻ������б�");
		System.out.println("******************************");
		for(int i=0;i<cus.length;i++){
			if (cus[i]!=null) {
				//������ﲻ���жϾͻ������ָ������
				System.out.print(cus[i].name+"\t");
			}
			
		}
	}
}
