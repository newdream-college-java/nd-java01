/*������㰮�����𣿡�������ش��ǡ�yes��������������ǰ��ҵġ�������ش���ǡ�no����
������ġ�ԭ���㲻���ҡ�������ش���������ģ���������㵽���ǰ����ǲ������Լ�����Ҳ���������
*/

import java.util.Scanner;

public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("�㰮����yes/no����");
		String str = input.next();
		if(str.equals("yes")){
			System.out.print("���ǰ��ҵ�");
		}else if(str.equals("no")){
			System.out.print("ԭ���㲻����");
		}else{
			System.out.print("�㵽���ǰ����ǲ������Լ�����Ҳ�����");
			}
	}
}