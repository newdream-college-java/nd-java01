package zuoye;

import java.util.Scanner;

public class Zylei3 {
	/*��������ѧ��������*/

	String[] names=new String[5];
	/*��������������С�շ壨����ĸСд������ÿ����������ĸ��д��
	 * ����������򣺴��շ�
	 * ��������������С�շ�
	 * ʹ���в�������������������ֵķ�����Ҫ������߱����ڵ��÷���ʱ�򴫵�һ��ѧ��
	 * */
	public void b(String name){
		//�ҵ�������Ԫ��Ϊnull���±�
		for (int i = 0; i < names.length; i++) {
			if(names[i]==null){
				//�ٽ�name�ŵ��±�λ��
				names[i]=name;
				break;
			}		
		}
	}
	public void s(){
		System.out.println("************************************");
		System.out.println("\t\t�ͻ������б�");
		System.out.println("************************************");
		for (int i = 0; i <names.length; i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println();
	}
	
public boolean a(int b,int c){//����boolean       ���������β�
	boolean f=false;
	//ָ�����������У���������
	Scanner input=new Scanner(System.in);
	System.out.print("������Ҫ���ĵĿͻ�������");
	String name=input.next();
	for(int i=b-1;i<c;i++){
		if(names[i].equals(name)){
			//Scanner input=new Scanner(System.in);
			System.out.print("�������µĿͻ�����:");
			String shuru=input.next();
			System.out.println("**********�޸Ľ��*********");
			System.out.println("�ҵ����޸ĳɹ�");
			names[i]=shuru;
			s();
			f=true;
			break;
		}
	}
	
	return f;//����boolean����
	}
}