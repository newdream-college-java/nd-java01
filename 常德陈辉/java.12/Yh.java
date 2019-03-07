import java.util.Scanner;

public class Yh {
	String name="你";
	int jf;
	public int showRg(){
		Scanner input=new Scanner(System.in);
		System.out.println("您选择：1,剪刀  2，石头  3，布");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("你出拳：剪刀");
				break;
			case 2:
				System.out.println("你出拳：石头");
				break;
			case 3:
				System.out.println("你出拳：布");
				break;
		}
		return a;
	}

}
