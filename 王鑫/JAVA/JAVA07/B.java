// �����ַ�����ESC����

import java.util.Scanner;
public class B{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("��������Ҫ¼����ַ�����ESC��������");
		String s = "",n;
		for(;;){
			n = input.next();
			if(!n.equals("ESC")){
				s+=n;
			}else{
				break;
			}
		}
		System.out.print(s);
	}
}