import java.util.Scanner;
public class Hw08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("****************************************"+"\n"+"��ѡ�������Ʒ��ţ�"+"\n"+"1.T��    2.����Ь   3.������"+"\n"+"****************************************");
		//ѭ��������Ʒ���
		System.out.println("��������Ʒ���");
		int num=input.nextInt();
		while(num>0&&num<4){
			if(num==1){
				System.out.println("T��"+"\t"+"��245.0");
				System.out.print("�Ƿ������y/n��");
				String ans=input.next();
				if(ans.equals("n")){
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("��������Ʒ���");
					num=input.nextInt();
				}
			}else if(num==2){
					System.out.println("����Ь"+"\t"+"��345.0");
					System.out.print("�Ƿ������y/n��");
					String ans=input.next();
					if(ans.equals("n")){
						System.exit(-1);
					}else if(ans.equals("y")){
						System.out.print("��������Ʒ���");
						num=input.nextInt();
					}
			}else if(num==3){
					System.out.println("����"+"\t"+"��45.0");
					System.out.print("�Ƿ������y/n��");
					String ans=input.next();
					if(ans.equals("n")){
						System.exit(-1);
					}else if(ans.equals("y")){
						System.out.print("��������Ʒ���");
						num=input.nextInt();
					}
			}
		}	
	}
}