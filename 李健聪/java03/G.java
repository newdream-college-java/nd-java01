import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>���˳齱");
		System.out.println("������4λ��Ա��");
		int hyh=input.nextInt();
		int bw=hyh/100%10;
		int number=(int)(Math.random()*10);
		if(bw==number){
			System.out.println(hyh+"�ſͻ������˿ͻ�����þ���MP3һ����");
		}else{
			System.out.println(hyh+"�ſͻ�û�н���ƨ��û�С�");
		}
		
	}
}