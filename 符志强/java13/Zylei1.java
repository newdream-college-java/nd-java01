package zuoye;
import java.util.Scanner;
public class Zylei1 {
	String name;
	String[] sz=new String[9999999];
	int a;
	public void mz() {
		
		Scanner input=new Scanner(System.in);
		String j;
		this.a=0;
		do{			
		System.out.print("������ͻ���������");
		name=input.next();
		sz[a]=name;
		System.out.println("���������𣿣�y/n��");
		j=input.next();
		if(j.equals("n")){
			System.out.println("***************************************");
			System.out.println("\t\t�ͻ������б�");
			System.out.println("***************************************");
			for(int i=0;i<=a;i++){
				System.out.print(sz[i]+"\t");
			}
		}
		a++;
		}while(j.equals("y"));
		
		
	}
}
