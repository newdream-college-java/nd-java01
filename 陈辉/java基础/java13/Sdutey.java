package java13;
import java.util.Scanner;
public class Sdutey {
	String[] name=new String[5];
	public void showNames(String names){
		for(int i=0;i<name.length;i++){
			if(name[i]==null){
				name[i]=names;
				break;
			} 
		}	
	}
	String zm;
	public void show(){
		for(int i=0;i<name.length;i++){
			Scanner input=new Scanner(System.in);
			System.out.println("������ͻ�����");
			zm=input.next();
			showNames(zm);
		}
	}
	public void show1(){
		System.out.println("********************************");
		System.out.println("�ͻ������б�");
		System.out.println("********************************");
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]);
		}
	}
	public void show2(){
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵĿͻ�����");
		zm=input.next();
		System.out.println("�������µĿͻ�����");
		String mz=input.next();
		System.out.println("*****�޸Ľ��");
		for(int i=0;i<name.length;i++){
			if(name[i].equals(zm)){
				name[i]=mz;
				System.out.println("�޸ĳɹ�������");
				break;
			}else{
				System.out.println("�޸�ʧ�ܣ�����");
				
			}	
			
		}
	}
	public void show3(){
		System.out.println("******************************");
		System.out.println("\t\t�ͻ������б�");
		System.out.println("******************************");
		show1();
	}
}
