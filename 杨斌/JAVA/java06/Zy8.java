import java.util.Scanner;
public class Zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("��������ĳɼ���");
			int a=input.nextInt();
			if(a<80){
				continue;
			}
			sum++;
			
		}
		System.out.print("��"+sum+"���˳ɼ�����80��");
	}

}