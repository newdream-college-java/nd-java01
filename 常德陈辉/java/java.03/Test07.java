/*���롰�㰮���𣿡�����ش��ǡ�yes���������롰���ǰ��ҵġ�������ش���ǡ�no�����������ԭ���㲻���ҡ�������ش������������������㵽���ǰ����ǲ������Լ�Ҳ���������*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("�㰮����");
	String str=input.next();
	if(str.equals("yes")){System.out.print("���ǰ��ҵ�");
	
		}else if(str.equals("no")){
			System.out.print("ԭ���㲻����");
			}else
	System.out.print("�㵽���ǰ����ǲ������Լ�Ҳ�����");
	}

}