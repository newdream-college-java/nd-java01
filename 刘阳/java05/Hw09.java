import java.util.Scanner;
public class Hw09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("****************************************"+"\n"+"��ѡ�������Ʒ��ţ�"+"\n"+"1.T��    2.����Ь   3.������"+"\n"+"****************************************");
		//ѭ��������Ʒ���
		System.out.println("��������Ʒ���");
		int num=input.nextInt();
		int sl;
		double sum=0,sf,a=0,b=0,c=0;
		while(num>0&&num<4){
			if(num==1){
				System.out.println("�����빺������");
				sl=input.nextInt();
				a=sl+a;
				sum=sl*245+sum;
				System.out.println("T��"+"\t"+"��245.0"+"\t"+"����"+a+"\t"+"�ϼƣ�"+sum);
				System.out.println("�Ƿ������y/n��");
				String ans=input.next();
				if(ans.equals("n")){
					System.out.println("������ʵ����");
					sf=input.nextDouble();
					System.out.println("�ۿۣ�0.8"+"\n"+"Ӧ����"+sum*0.8+"\n"+"ʵ����"+sf+"\n"+"��Ǯ��"+(sf-sum*0.8));
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("��������Ʒ���");
					num=input.nextInt();
				}
			}else if(num==2){
				System.out.println("�����빺������");
				sl=input.nextInt();
				b+=sl+b;
				sum=sl*345+sum;
				System.out.println("����Ь"+"\t"+"��345.0"+"\t"+"����"+b+"\t"+"�ϼƣ�"+sum);
				System.out.print("�Ƿ������y/n��");
				String ans=input.next();
				if(ans.equals("n")){
					System.out.println("������ʵ����");
					sf=input.nextDouble();
					System.out.println("�ۿۣ�0.8"+"\n"+"Ӧ����"+sum*0.8+"\n"+"ʵ����"+sf+"\n"+"��Ǯ��"+(sf-sum*0.8));
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("��������Ʒ���");
					num=input.nextInt();
				}
			}else if(num==3){
				System.out.println("�����빺������");
				sl=input.nextInt();
				c=sl+c;
				sum=sl*45+sum;
				System.out.println("����"+"\t"+"��45.0"+"\t"+"����"+c+"\t"+"�ϼƣ�"+sum);
				System.out.print("�Ƿ������y/n��");
				String ans=input.next();
				if(ans.equals("n")){
					System.out.println("������ʵ����");
					sf=input.nextDouble();
					System.out.println("�ۿۣ�0.8"+"\n"+"Ӧ����"+sum*0.8+"\n"+"ʵ����"+sf+"\n"+"��Ǯ��"+(sf-sum*0.8));
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("��������Ʒ���");
					num=input.nextInt();
				}
			}
		}	
	}
}