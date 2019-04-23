import java.util.Scanner;


public class Player {
	String name;
	int score;
	//开始游戏操作；
	public int chuquan(){
		Scanner input=new Scanner(System.in);
		int choice=0;
		System.out.println("请选择出拳！1.石头   2.剪刀   3.布");
		if(input.hasNextInt()){
			choice=input.nextInt();
			switch(choice){
				case 1:
					System.out.println("你出拳：石头！");
					break;
				case 2:
					System.out.println("你出拳：剪刀！");
					break;
				case 3:
					System.out.println("你出拳：布！");
					break;
				default:
					System.out.println("很抱歉！请认真输入代表出拳类型的数字：");
					chuquan();
					break;
			}
		}else{
			System.out.println("很抱歉！无法执行！请输入符合条件的数字：");
			chuquan();
		}
		return choice;
	}
}
