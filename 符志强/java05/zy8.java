import java.util.Scanner;
public class zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println("************************************");
		System.out.println("��ѡ������Ʒ��ţ�"+"\n1.T��"+"\t2.����Ь"+"\t3.������");
		System.out.println("************************************");
		System.out.print("��������Ʒ��ţ�");
		int bh=input.nextInt();	
		while(bh>=1&&bh<=3){
			if(bh==1){
				System.out.println("T��\t"+"��245.0");
				System.out.print("�Ƿ������y/n��");
				String yn=input.next();
				if(yn.equals("n")){
					break;
				}
			}
			if(bh==2){
				System.out.println("����Ь\t"+"��570.0");
				System.out.print("�Ƿ������y/n��");
				String yn=input.next();
				if(yn.equals("n")){
					break;
				}
			}
			if(bh==3){
				System.out.println("������\t"+"��320.0");
				System.out.print("�Ƿ������y/n��");
				String yn=input.next();
				if(yn.equals("n")){
					break;
				}
			}
		}
	}
}