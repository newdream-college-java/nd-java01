import java.util.Scanner;
public class Demp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a =input.next();//����
		String b ="";
		while(!a.equals("esc")){
			System.out.println(a);
			a =input.next();
			System.out.println("���ڴ�����"+a);//���
			if(a.equals("esc")){
				System.out.println(b);
			}	//System.out.println("abcdef");
		}

	}
}