import java.util.Scanner;
public class hw04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�㰮��ô��");
		String a= input.next();
		String b="yes",c="no";
		if(a.equals(b)){
			System.out.print("���ǰ��ҵ�");
		}else if(a.equals(c)){
			System.out.print("ԭ���㲻����");
		}else{
			System.out.print("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}
	}

}