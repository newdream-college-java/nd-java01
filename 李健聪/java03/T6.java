import java.util.Scanner;
public class T6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������źƵ�java�ɼ�");
		double score = input.nextDouble();
		if(score>98){
			System.out.print("��ʦ������һ��MP4");
		}
		else{
			System.out.print("��");
		}
	}
}
\*import java.util.Scanner;
public class T6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������źƵ�java�ɼ������ֳɼ�");
		double score1=input.nextDouble();
		double score2=input.nextDouble();
		if((score1>98&&score2>80)||(score1==100&&score2>70)){
			System.out.println("�ź���ʦ������һ��MP4");
		}else{
			System.out.println("�ź����������Ŷ");
		}
	}
}*\