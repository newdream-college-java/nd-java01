package 人机猜拳;
import java.util.Random;
public class Test1 {
	String name;
	int score;
	public int jqr(){
		Random rd=new Random();
		int choice=rd.nextInt(2)+1;
		switch(choice){
			case 1:
				System.out.println(name+"出拳：石头");
				break;
			case 2:
				System.out.println(name+"出拳：剪刀");
				break;
			case 3:
				System.out.println(name+"出拳：布");	
				break;
				}
			System.out.println();
			return choice;
			}
		
}
