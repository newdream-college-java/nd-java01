import java.util.Scanner;


public class Hw01 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int choice;
		System.out.print("������γ̴��ţ�1~3֮������֣�");
		try{
			choice=in.nextInt();
			if(choice==1){
				System.out.println("C#���");
			}else if(choice==2){
				System.out.println("JAVA���");
			}else if(choice==3){
				System.out.println("SQL����");
			}else{
				System.out.println("������˼��ѡ��ʧ�ܣ�����ȷ����1~3�����ֱ����ѡ��γ̣�");
			}
		}catch(Exception e){
			System.out.println("������˼��ѡ��ʧ�ܣ�����ȷ����1~3�����ֱ����ѡ��γ̣�");
		}finally{
			System.out.println("��ӭ������飡");
		}
	}
}
