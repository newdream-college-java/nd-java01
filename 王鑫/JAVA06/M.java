// ѭ���������0�����ֽ����ۼӣ�֪������0�������������

import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i = 1;i<=5;i++){
			System.out.println("�������"+i+"ѧ���ɼ���");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(a<80||b<80||c<80){
				continue;
			}
			System.out.println("��ѧ�����ųɼ�����80�֣�");
		}
	}
}