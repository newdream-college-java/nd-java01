import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println("*****************************************");
		System.out.println("\t1.�ͻ���Ϣ����\n\t2.�������\n\t3.�������\n\t4.ע��");
		System.out.println("*****************************************");
		double x=245,y=314,z=450,j=0,q=0.8,d=0;
		int i=1;
		while(i!=0){
			int a=input.nextInt();
			if(a==1){
				System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����");
				i=0;
			}else if(a==2){
				System.out.println("MyShopping����ϵͳ>�������");
				System.out.println("*****************************************");
				System.out.println("\t��ѡ�������Ʒ���\n\t1.T��\n\t2.����Ь\n\t3.������");
				System.out.println("*****************************************");
				while(i!=0){
				System.out.print("��������Ʒ��ţ�");
				int b=input.nextInt();
				System.out.print("\n��������Ʒ������");
				int c=input.nextInt();
				switch(b){
					case 1:
						d=x*c;
						System.out.println("T����"+x+"������"+c+"�ϼƣ�"+d);
						break;
					case 2:
						d=y*c;
						System.out.println("����Ь��"+y+"������"+c+"�ϼƣ�"+d);
						break;
					case 3:
						d=z*c;
						System.out.println("����Ь��"+z+"������"+c+"�ϼƣ�"+d);
						break;
					default:
						System.out.println("����������������룺");
						break;
				
					}
				/*if(b==1){
					d=x*c;
					System.out.println("T����"+x+"������"+c+"�ϼƣ�"+d);
					break;
				}else if(b==2){
					d=y*c;
					System.out.println("����Ь��"+y+"������"+c+"�ϼƣ�"+d);
					break;
				}else if(b==3){
					d=z*c;
					System.out.println("����Ь��"+z+"������"+c+"�ϼƣ�"+d);
					break;
				}else{
					System.out.println("����������������룺");
					break;
				}*/
					System.out.print("�Ƿ������y/n����");
					String yn=input.next();
					if(yn.equals("y")){
						j=j+d;
					}else if(yn.equals("n")){
						j=(j+d)*q;
						
						System.out.println("�ۿۣ�"+q+"Ӧ�����:"+j);
						System.out.print("ʵ����");
						int w=input.nextInt();
						double e;
						e=w-j;
						System.out.print("\n��Ǯ��"+e);
						i=0;
					}else{
						System.out.println("�����������������");
						yn=input.next();
					if(yn.equals("y")){
						j=j+d;
					}else if(yn.equals("n")){
						j=(j+d)*q;
						
						System.out.println("�ۿۣ�"+q+"Ӧ�����:"+j);
						System.out.print("ʵ����");
						int w=input.nextInt();
						double e;
						e=w-j;
						System.out.print("\n��Ǯ��"+e);
						i=0;
					}
					}
				}
			}else if(a==3){
				System.out.println("MyShopping����ϵͳ>�������");
				i=0;
			}else if(a==4){
				System.out.println("MyShopping����ϵͳ>ע��");
				i=0;
			}else{
				System.out.println("����������������룺");
			}
		}
	}
}