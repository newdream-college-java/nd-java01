//ѭ����������ѧ���ĳɼ���ͳ���ж����˵ĳɼ�����80�֣�Ҫ��ʹ��continue������

import java.util.Scanner;

public class Test02{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i = 1 ; i <= 5 ; i++){
			int scort = input.nextInt();
			if(scort>80){
				count++;
			}
		}
		System.out.print(count);
	}
}