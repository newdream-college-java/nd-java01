import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������ֽ�ʲô");
		String answer=input.next();
		while(answer.equals("��������")){
			System.out.println("������ֽ�ʲô");
			answer=input.next();
			
		}System.out.println("�������ԭ���У�"+answer);
		
	}
}