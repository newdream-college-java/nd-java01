import java.util.Scanner;
public class Zy10{
	public static void main(String[] aegs){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.println("");
		
		for(int n=1;n<=3;n++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int s=input.nextInt();
				
			while(s>=1000&&s<=9999){	
					
				System.out.print("�������Ա���գ���<����λ������ʾ>����");
				int y=input.nextInt();	
				while(y>0&&y<=12){	
							
						break;
				}
				if(y<=0||y>12){
					break;	
				}
				System.out.print("�������Ա���գ���<����λ������ʾ>����");
				int r=input.nextInt();
				while(r>0&&r<=31){	
					break;
				}
				if(r<=0||r>31){
					break;	
				}
				System.out.print("�������Ա���֣�");
				int jf=input.nextInt();
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println(s+"\t"+y+"/"+r+"\t"+jf);
				break;
			}
			break;
		}
	}
}