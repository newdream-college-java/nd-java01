package java14;
import java.util.Scanner;
public class Kzhitai {
		//public static void main(String[]args){ 
	public void show(){
			Scanner input=new Scanner("System.in");
			System.out.println("��ӭ��������꣡����");
			System.out.println("��������Ҫ�����ĳ�������");
			String xb=input.next();
			
			System.out.println("��ѡ�������ĳ�������1��������2�����");
			int bo=input.nextInt();
			if(bo==1){
				
				System.out.println("ѡ��Ĺ���");
			}else if(bo==2){
				System.out.println("ѡ��������");
			}else{
				System.out.println("ѡ�����");
			}
			System.out.println("��ѡ�񹷹���Ʒ��1����������������Ȯ2������ѩ����");
			int po=input.nextInt();
			if(po==1){
				System.out.println("ѡ����Ǵ�������������");
			}else if(po==2){
				System.out.println("ѡ����ǿ���ѩ����");
			}else{
				System.out.println("ѡ�����");
			}
			System.out.println("�ҵ����ֽУ�"+xb+"����ֵ�ǣ�"+100+"�����˵����ܶ�Ϊ��"+80+"����һֻ��������������");
		}
}				


