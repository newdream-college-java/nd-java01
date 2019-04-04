import java.util.Scanner;
public class Person {
	String name;
	int score;
	public int showFist(){
		System.out.print("请出拳：1.剪刀2.石头3.布(输入相应数字):");
		Scanner input=new Scanner(System.in);
		int cq=0;
		if(input.hasNextInt()) {
			cq=input.nextInt();
		}
		switch(cq){
			case 1:
				System.out.println("你出拳：剪刀");
				break;
			case 2:
				System.out.println("你出拳：石头");
				break;
			case 3:
				System.out.println("你出拳：布");
				break;
			default:
				System.out.println("输入错误");
				break;
		
		}
		return cq;
	}
}
