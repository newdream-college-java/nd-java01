import java.util.Scanner;
public class K{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a=0;
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		for(int i=1;i<4;i++){
			System.out.print("�������Ա��(<4λ����>)");
			if(input.hasNextInt()){
				for(;;){	
					
					if(!(a>=1000&a<10000)){
						a=input.nextInt();
						System.out.println("���������д�������������");
						
					                                                                                                                       
					}
					else{
						break;
					}
				}
			}
			String b;
			System.out.println("�������Ա����(��/��<����λ������ʾ>)");
			b=input.next();
			System.out.println("�������Ա����");
			int c=input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ��"+a+"\t"+b+"\t"+c);
		}
	}
}