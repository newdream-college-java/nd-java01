//�û�������Ϸ��ѡ��
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ����Ҫ�����Ϸ\n\n");
		System.out.println("***************************************");
		System.out.println("\t\t1.������");
		System.out.println("\t\t2.��ţ");
		System.out.println("\t\t3.������");
		System.out.println("\t\t4.������");
		System.out.println("***************************************\n\n");
		System.out.print("��ѡ����������");
		int a=input.nextInt();
		int x=10,r=20;
		int b,c,d,e;
		int s=0;
		int i;
		double sl;
		switch(a){
			case 1:
			System.out.println("���ѽ��붷��������,����Ϸ����������Ϸ");
			System.out.println("��������Ϸʱ��");
			b=input.nextInt();
			while(b!=0){
				if(b<10&&b>0){
				System.out.println("��ѡ����"+b+"Сʱ����������8���Żݣ�����Ҫ֧��"+(b*x*0.8)+"����Ϸ��");
				break;
				}
				else{
				System.out.println("��ѡ����"+b+"Сʱ����������8���Żݣ�����Ҫ֧��"+(b*x*0.5)+"����Ϸ��");	
				break;		
				}
			}
			System.out.println("������������Ϸƽ̨>��Ϸ����");
			System.out.println("��ʼ��Ϸ��׼����ʼ��,��������ĳɼ�");
			for( i=1;i<=5;i++){
				a=input.nextInt();
				System.out.println("���������"+i+"�֣��ɼ�Ϊ"+a);
				if(a>=80){
			    		++s;	
				}
					if(i==5){
						System.out.println("���ѳɹ���������Ϸ");	
						sl=s*1.0/i;	
						if(sl>=0.8){
							System.out.println("������˲�����һ��");
						}			
					}	
						
						
			}		
				
			break;
			case 2:
			System.out.println("���ѽ��붷ţ����,����Ϸ����������Ϸ");
			System.out.println("��������Ϸʱ��");
			c=input.nextInt();
			while(c!=0){
				if(c<10&&c>0){
				System.out.println("��ѡ����"+c+"Сʱ����������8���Żݣ�����Ҫ֧��"+(c*x*0.8)+"����Ϸ��");
				break;
				}
				else{
				System.out.println("��ѡ����"+c+"Сʱ����������8���Żݣ�����Ҫ֧��"+(c*x*0.5)+"����Ϸ��");	
				break;		
				}
			}
			break;
			case 3:
			System.out.println("���ѽ�������������,����Ϸ�������о�������Ϸ");
			System.out.println("��������Ϸʱ��");
			d=input.nextInt();
			while(d!=0){
				if(d<10&&d>0){
				System.out.println("��ѡ����"+d+"Сʱ����������8���Żݣ�����Ҫ֧��"+(d*r*0.8)+"����Ϸ��");		
				break;
				}
				else{
				System.out.println("��ѡ����"+d+"Сʱ����������8���Żݣ�����Ҫ֧��"+(d*r*0.5)+"����Ϸ��");	
				break;		
				}
			}
			break;
			case 4:
			System.out.println("���ѽ�������������,����Ϸ�������о�������Ϸ");
			System.out.println("��������Ϸʱ��");
			e=input.nextInt();
			while(e!=0){
				if(e<10&&e>0){
				System.out.println("��ѡ����"+e+"Сʱ����������8���Żݣ�����Ҫ֧��"+(e*r*0.8)+"����Ϸ��");
				break;
				}
				else{
				System.out.println("��ѡ����"+e+"Сʱ����������8���Żݣ�����Ҫ֧��"+(e*r*0.5)+"����Ϸ��");	
				break;		
				}
			}
			break;
		}
	}
}