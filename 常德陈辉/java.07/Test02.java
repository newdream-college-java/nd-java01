/*ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc���ͽ���ѭ���������ʾ��������������ַ�������������abc ����def ����Esc �����abcdef*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	String sum="";
	for(;;){
		System.out.print("�������ַ�����");
		String a=input.next();
		if(!a.equals("Esc")){
				sum+=a;
			}else{
				break;
			}
		}
	System.out.print(sum);
	}

}