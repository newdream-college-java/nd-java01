import java.util.*;
public class work6{
	public static void main(String []args){
		System.out.print("��ȭ��Ϸ\n");
		Scanner input = new Scanner(System.in);
		Random rd=new Random();
		String a = input.next();
		switch(a){
			case "0":
			case "ʯͷ":
				System.out.print("�������ʯͷ");
				break;
			case "1":
			case "����":
				System.out.print("������Ǽ���");
				break;
			case "2":
			case "��":
				System.out.print("������ǲ�");
				break;
			default:
				System.out.print("�������");
				break;
		}
		int b = rd.nextInt(3);
		switch(b){
			case 0:
				System.out.print("���Գ�����ʯͷ");
				break;
			case 1:
				System.out.print("���Գ����Ǽ���");
				break;
			case 2:
				System.out.print("���Գ����ǲ�");
				break;

		}

	}
}