import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�㰮����");
		System.out.println("������yes����no");
		String a=input.next();
		if(a.equals("yes")){	
			System.out.println("���ǰ��ҵ�");
		}else if(a.equals("no")){
			System.out.println("ԭ���㲻����");
		}else{
			System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}
	
}
}