package zuoye;
import java.util.Scanner;
public class CustomerBiz {
	String name;
	String[] names=new String[4];
	String xuanze;
	int i=0;
	public void addname(){
		Scanner input=new Scanner(System.in);
			//��ʾ����ͻ�����
		System.out.print("������ͻ���������"+"\n");
		name=input.next();
		choice();
	}
	public void choice(){
		Scanner input=new Scanner(System.in);
		names[i]=name;
		//ѯ��ѡ��
		System.out.print("���������𣿣�y/n����");
		System.out.println(" ");
		xuanze=input.next();
		if(i<names.length-1){
			if("y".equals(xuanze)){
				i++;
				addname();
			}else if("n".equals(xuanze)){
				showname();
			}
		}else{
			System.out.println("�����Ѵ����ޣ����ٽ������룬��ʾ�ͻ������б�");
			showname();
		}
	}
	public void showname(){
		System.out.println("************************************");
		System.out.println("\t\t�ͻ������б�\t\t");
		System.out.println("************************************\n");
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]="��";
			}
		}
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+"\t");
		}
		System.exit(-1);
	}
}
