import java.util.Random;
public class Jsj {
	Random rd=new Random();
		String name;
		int jf;
		public int showDl(){
		int a=rd.nextInt(3)+1;
		switch(a){
			case 1:
				System.out.println(name+"��ȭ������");
				break;
			case 2:
				System.out.println(name+"��ȭ��ʯͷ");
				break;
			case 3:
				System.out.println(name+"��ȭ����");
				break;
		}
		return a;
	}
}
