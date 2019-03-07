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
		System.out.print("请输入客户的姓名：");
		name=input.next();
		sz[a]=name;
		System.out.println("继续输入吗？（y/n）");
		j=input.next();
		if(j.equals("n")){
			System.out.println("***************************************");
			System.out.println("\t\t客户姓名列表：");
			System.out.println("***************************************");
			for(int i=0;i<=a;i++){
				System.out.print(sz[i]+"\t");
			}
		}
		a++;
		}while(j.equals("y"));
		
		
	}
}
