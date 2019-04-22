import java.util.Random;
public class Jsj {
	Random rd=new Random();
		String name;
		int jf;
		public int showDl(){
		int a=rd.nextInt(3)+1;
		switch(a){
			case 1:
				System.out.println(name+"出拳：剪刀");
				break;
			case 2:
				System.out.println(name+"出拳：石头");
				break;
			case 3:
				System.out.println(name+"出拳：布");
				break;
		}
		return a;
	}
}
