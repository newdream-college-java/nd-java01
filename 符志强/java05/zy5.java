import java.util.Scanner;
public class zy5{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("��������Ҫ��������0Ϊʯͷ��1Ϊ������2Ϊ��");
	int  i=input.nextInt();
	while(i>=0&&i<=2){
		if(i==0){
			System.out.println("�������ʯͷ");
			break;
		}else 	if(i==1){
			System.out.println("������Ǽ���");
			break;
		}else 	if(i==2){
			System.out.println("������ǲ�");
			break;
		}
	}
	
	}
}