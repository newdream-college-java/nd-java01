import java.util.Random;
public class Computer {
	String name;
	int score;
	public int jsj(){
		Random rd=new Random();
		int s=rd.nextInt(3)+1;
		switch(s){
		case 1:
			System.out.println("电脑出拳：剪刀");
			break;
		case 2:
			System.out.println("电脑出拳：石头");
			break;
		case 3:
			System.out.println("电脑出拳：布");
			break;
		default:
			System.out.println("输入错误");
			break;
	
		}
		return s;
	}
}
