import java.util.Scanner;


public class Testdr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Dr dr=new Dr();
		dr.showLoginMenu();
		int a=input.nextInt();
		if(a==1){
			for (;;) {
				System.out.print("�������û�����");
				String name=input.next();
				System.out.print("���������룺");
				int mm=input.nextInt();
				if(name.equals(dr.name)&&mm==dr.mm){
					System.out.println("����ɹ�");
					break;
				}else{
					System.out.println("@@��û��Ȩ�޵���ϵͳ�������µ��롣@@");
				}
			}
		}else{
			System.out.print("���˳�");
		}
	}

}
