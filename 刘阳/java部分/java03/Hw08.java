import java.util.Scanner;
public class Hw08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������4λ��Ա�ţ�");
		int a =input.nextInt();
		if(a>+1000&&a<+9999){
			System.out.print(a+"�ſͻ���лл����֧�֣�");
		}else{
			System.out.print("����Ļ�Ա�Ŵ���");
		}
	}

}