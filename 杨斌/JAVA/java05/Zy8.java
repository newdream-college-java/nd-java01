import java.util.Scanner;
public class Zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ��Myshopping����ϵͳ");
		System.out.println("**********************************");
		System.out.println("1.�ͻ�����ϵͳ2.�������3.�������.4.ע��");
		System.out.println("**********************************");
		System.out.println("��ѡ����������:");
		int u=input.nextInt();
		int k=1;
		while(k>=1){		
			if(u==2){
				System.out.println("ִ�й������");
				k=0;
			}else{
				System.out.println("����������������:");
				u=input.nextInt();
			}	
		}	
		int i=1;
		double d=245.0;	
		double e=300.0;	
		double f=400.0;	
		double sum=0;
		double g=0;
		while(i>=1){
			System.out.println("Myshopping����ϵͳ>�������");
			System.out.println("**********************************");
			System.out.println("��ѡ�������Ʒ��ţ�");
			System.out.println("1.T��\t2.����Ь\t3.������");
			System.out.println("**********************************");
			System.out.print("��������Ʒ��ţ�");
			int a=input.nextInt();
			System.out.print("�����빺��������");
			int b=input.nextInt();		
			if(a==1){
				g=d*b;	
				System.out.println("T����"+d+"\t����"+b+"\t�ϼ�"+g);			
			}else if(a==2){
				g=e*b;			
				System.out.println("����Ь��"+e+"\t����"+b+"\t�ϼ�"+g);			
			}else if(a==3){
				g=f*b;			
				System.out.println("�����ģ�"+f+"\t����"+b+"\t�ϼ�"+g);			
			}else{	
				
				System.out.println("���������������룺");
				int q=1;
				while(q>=1){
					
					System.out.print("��������Ʒ��ţ�");
					a=input.nextInt();
					System.out.print("�����빺��������");
					b=input.nextInt();
					if(a==1){
						g=d*b;	
						System.out.println("T����"+d+"\t����"+b+"\t�ϼ�"+g);
						q=0;		
					}else if(a==2){
						g=e*b;			
						System.out.println("����Ь��"+e+"\t����"+b+"\t�ϼ�"+g);	
						q=0;		
					}else if(a==3){
						g=f*b;			
						System.out.println("�����ģ�"+f+"\t����"+b+"\t�ϼ�"+g);	
						q=0;		
					}else{
						System.out.println("���������������룺");
								
					}
				}
			}
			System.out.println("�Ƿ������Y/N��");
			String c=input.next();	
			if(c.equals("Y")){
				sum=g+sum;
			}else if(c.equals("N")){
				sum=g+sum;
				i=0;
			}else{
				System.out.println("���������������룺");
				int w=1;
				while(w>=1){
					System.out.println("�Ƿ������Y/N��");
					c=input.next();	
					if(c.equals("Y")){
						sum=g+sum;
						w=0;
					}else if(c.equals("N")){
						sum=g+sum;
						w=0;
						i=0;
					}else{
						System.out.println("���������������룺");
								
					}
				}
			}
			
		}
		double z=0.8;
		System.out.println("�ۿۣ�"+z);
		System.out.println("Ӧ����"+sum*z);
		System.out.print("������ʵ����");
		double s=input.nextDouble();
		System.out.println("��Ǯ��"+(s-sum*z));		
	}
}