import java.util.Scanner;
public class zy10{
	public static void main(String[] aegs){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t��ӭʹ��Shopping�������ϵͳ");
		System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
		System.out.println("\t\t\t1���ͻ���Ϣ����");
		System.out.println("\t\t\t2���������");
		System.out.println("\t\t\t3���������");	
		System.out.println("\t\t\t4��ע��");
		System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
		System.out.println();
		System.out.print("��ѡ���������֣�");
		int s=input.nextInt();
		if(s<=0&&s>=5){
			System.out.print("��������������������֣�");
			s=input.nextInt();
		}
		while(s>0&&s<5){
			if(s==1){
				System.out.println("�������ܣ���Ȩ�޲���");
				System.out.println("�Ƿ�������룺������1.������2");
				int js=input.nextInt();
				if(js==1){
					System.out.print("��ѡ���������֣�");
					s=input.nextInt();
				}
				if(js==2){
					break;
				}
			}
			if(s==2){
				System.out.println("MyShopping����ϵͳ>�������");
				System.out.println("************************************");
				System.out.println("��ѡ������Ʒ��ţ�"+"\n1.T��"+"\t2.����Ь"+"\t3.������");
				System.out.println("************************************");
				System.out.print("��������Ʒ��ţ�");
				int bh=input.nextInt();
				System.out.print("�����빺��������");
				int sl=input.nextInt();
				double a=245.0,b=570.0,c=320.0,h=0;	
				switch(bh){
					case 0:
					case 1:
						System.out.println("T��\t��"+a);
						System.out.print("������"+sl);
						h=a*sl;	
					
						System.out.println("�ϼƣ���"+h);
						System.out.print("�Ƿ������y/n��");
						String yn=input.next();
						if(yn.equals("n")){
							System.out.println("�ۿۣ�\t0.8");
						
							System.out.println("Ӧ����"+h);
							System.out.println("��������ʵ���Ľ��");
							System.out.print("ʵ����");
							double sf=input.nextDouble();
							double zq=sf-h;
							System.out.println("��Ǯ��"+zq);
							System.out.println("�Ƿ�������룺������1.������2");
							int js=input.nextInt();
							switch(js){
								case 0:
								case 1:
									System.out.print("��ѡ���������֣�");
									s=input.nextInt();
								case 2:	
									s=0;
									break;
								default :
									System.out.println("�������,���ٴ����룺������1.������2");
									js=input.nextInt();
									break;
							}
						}
						
						break;
						
					case 2:
						System.out.println("����Ь\t��"+b);
						System.out.print("������"+sl);
						h=b*sl;
						
						System.out.println("�ϼƣ���"+h);
						System.out.print("�Ƿ������y/n��");
						yn=input.next();
						if(yn.equals("n")){
							System.out.println("�ۿۣ�\t0.8");
						
							System.out.println("Ӧ����"+h);
							System.out.println("��������ʵ���Ľ��");
							System.out.print("ʵ����");
							double sf=input.nextDouble();
							double zq=sf-h;
							System.out.println("��Ǯ��"+zq);
							System.out.println("�Ƿ�������룺������1.������2");
							int js=input.nextInt();
							switch(js){
								case 0:
								case 1:
									System.out.print("��ѡ���������֣�");
									s=input.nextInt();
								case 2:	
									s=0;
									break;
								default :
									System.out.println("�������,���ٴ����룺������1.������2");
									js=input.nextInt();
									break;
							}
						}
						
						break;
					
					case 3:
						System.out.println("������\t��"+c);
						System.out.print("������"+sl);
						h=c*sl;
					
						System.out.print("�ϼƣ���"+h);
						System.out.print("�Ƿ������y/n��");
						yn=input.next();
						if(yn.equals("n")){
							System.out.println("�ۿۣ�\t0.8");
					
							System.out.println("Ӧ����"+h);
							System.out.println("��������ʵ���Ľ��");
							System.out.print("ʵ����");
							double sf=input.nextDouble();
							double zq=sf-h;
							System.out.println("��Ǯ��"+zq);
							System.out.println("�Ƿ�������룺������1.������2");
							int js=input.nextInt();
					
							switch(js){
								case 0:
								case 1:
									System.out.print("��ѡ���������֣�");
									s=input.nextInt();
								case 2:	
									s=0;
									break;
								default :
									System.out.println("�������,���ٴ����룺������1.������2");
									js=input.nextInt();
									break;
							}
							
						}
						
						break;
					default :
						System.out.println("�������");
						break;
				
				}
			
			}
			if(s==3){
				System.out.println("�����������");
				System.out.println("�Ƿ�������룺������1.������2");
				int js=input.nextInt();
				if(js==1){
					System.out.print("��ѡ���������֣�");
					s=input.nextInt();
				}
				if(js==2){
					break;
				}
			}
			if(s==4){
				System.out.println("����ûʲô");
				System.out.println("�Ƿ�������룺������1.������2");
				int js=input.nextInt();
				if(js==1){
					System.out.print("��ѡ���������֣�");
					s=input.nextInt();
				}
				if(js==2){
					break;
				}
			}
		}
		
	}


}