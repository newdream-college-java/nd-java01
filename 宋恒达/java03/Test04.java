/**
**���"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ�� �㲻����",
����ش���������������"�㵽���ǰ����ǲ������Լ�Ҳ�����". 
**/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		System.out.println("���⣺�㰮����");
		Scanner input=new Scanner(System.in);
		System.out.print("�ش�");
		String answer=input.next();
		if(answer.equals("yes")){
			System.out.println("���ǰ��ҵ�");
		}else if(answer.equals("no")){
			System.out.println("ԭ���㲻����");
		}else{
			System.out.println("�㵽�װ����ǲ������Լ�Ҳ�����");
		}	
	}
}