// ѭ���������0�����ֽ����ۼӣ�֪������0�������������

import java.util.Scanner;
public class L{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(;;){
			int n = input.nextInt();
			if(n!=0){
				sum+=n;
			}else{
				break;
			}
		}
		System.out.println(sum);
	}
} 
