/**
**ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ��
**����ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)����
**�ۼӵ��ܽ��
**������ n ʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ��������
**/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		boolean flag1=true;
		double price1=245;
		double price2=340;
		double price3=400;
		Scanner input=new Scanner(System.in);
		System.out.println("*****************************");
		System.out.println("��ѡ�������Ʒ���:");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*****************************");
		do{
			System.out.print("��������Ʒ���:");
			int a=input.nextInt();
			switch(a){
				case 1: 
					System.out.println("T��\t��"+price1);
					break;
				case 2:
					System.out.println("����Ь\t��"+price2);
					break;
				case 3:
					System.out.println("������\t��"+price3);
					break;
				default:
					System.out.println("�������");
			}
			System.out.println();
			System.out.println();
			System.out.print("�Ƿ������y/n��");
			String b=input.next();
			if(b.equals("y")){
				continue;
			}else{
				flag1=false;
			}
		}while(flag1);
		System.out.println("*****************************");
		System.out.println("��ѡ�������Ʒ���:");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*****************************");
		System.out.println();
		System.out.println();
		boolean flag2=true;
		double sum=0;
		do{
			System.out.print("��������Ʒ���:");
			int c=input.nextInt();
			System.out.print("�����빺������:");
			int d=input.nextInt();
			switch(c){
				case 1:
					System.out.println("T����"+price1+"\t����"+d+"\t�ϼ�					  		��"+(price1*d));
					sum+=(price1*d);
					break;
				case 2:
					System.out.println("����Ь��"+price2+"\t����"+d+"\t�ϼ�					  		��"+(price2*d));
					sum+=(price2*d);
					break;
				case 3:
					System.out.println("�����ģ�"+price3+"\t����"+d+"\t�ϼ�					  		��"+(price3*d));
					sum+=(price3*d);
					break;
				default:
					System.out.println("�������");
						
			}
			System.out.print("�Ƿ������y/n��");	
			String e=input.next();
			if(e.equals("y")){
				continue;
			}else{
				System.out.println();
				System.out.println();
				System.out.print("�ۿ�:");
				double discount=input.nextDouble();
				double shouldPayCount=sum*discount;
				System.out.println("Ӧ�����:"+shouldPayCount);
				System.out.print("ʵ�����:");
				double payCount=input.nextDouble();
				System.out.println("��Ǯ:"+(payCount-shouldPayCount));
				flag2=false;
			}		
		}while(flag2);
	}
}