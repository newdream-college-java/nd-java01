import java.util.Scanner;
public class Hw02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int score,a=0;
		for(int i=1;i<=5;i++){
			System.out.println("������ѧ���ɼ���");
			score=input.nextInt();
			if(score>80){
				a++;
			}else{
				continue;
			}
		}
		System.out.print("��"+a+"��ѧ���ɼ�����80�֣�");
	}
}