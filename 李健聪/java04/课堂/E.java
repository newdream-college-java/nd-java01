import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���ĳɼ��Ƿ�ϸ�");
		String answer =input.next();
		while(answer.equals("���ϸ�")){
			System.out.println("�����Ķ��̲ģ�ѧϰ���ۣ������̣����մ���");
			System.out.println("���ĳɼ��Ƿ�ϸ�");
			 answer =input.next();
		}
	}	
}