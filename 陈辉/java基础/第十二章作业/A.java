import java.util.Random;

public class Computer {
	//属性---名字，积分
	String name;
	int score;
	public int showFist(){
		Random rd = new Random();
		int choice = rd.nextInt(3)+1;
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
		return choice;
		
	}
}
