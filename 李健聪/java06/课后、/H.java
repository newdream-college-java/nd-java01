import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int b=0;
		System.out.println("��ֱ�����5��ѧ���ĳɼ�");
		for(int i=1;i<=5;i++){
			System.out.println("�������"+i+"���˵ĳɼ�");
			int a=input.nextInt();
			if(a<80){
				continue;
			}if(a>80){
				++b;
			}
		}System.out.println("һ����"+b+"���˵ĳɼ�����80��");
	} 
}