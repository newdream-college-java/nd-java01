import java.util.Scanner;
public class Student {
	String[] names=new String[5];
	public void show(String name){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void showNames(){
		System.out.println("******************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("******************************");
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
	}
	public void gg(){
		Scanner input=new Scanner(System.in);
		System.out.print("\n������Ҫ�޸ĵĿͻ�����:");
		String n=input.next();
		System.out.print("\n�������µĿͻ�����:");
		String q=input.next();
		System.out.println("****�޸Ľ��****");
		boolean flag=false;
		for(int i=0;i<names.length;i++){
			if(names[i].equals(n)){
				flag=true;
				names[i]=q;
				System.out.println("�ҵ����޸ĳɹ�");
				showNames();
				break;
			}			
		}
		if(!flag){
			System.out.println("û���ҵ�������Ŀͻ�����");
		}
		
		
	}
}