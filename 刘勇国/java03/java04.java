import java.util.Scanner;
public class java04{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("�㰮����(yes/no)");
	String answer = input.next();
	if(answer.equals("yes")){
		System.out.println("���ǰ��ҵ�");
	}
	else if(answer.equals("no")){
		System.out.println("�㲻����");
	}else{
		System.out.println("�㵽���ǰ��һ��ǲ�����");
	}
	}
}