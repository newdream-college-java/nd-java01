package zuoye;
import java.util.Scanner;
public class Triangle {
	int row;
	String ch;
	public void printTriangle(int row,String ch){
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch);
			}
			System.out.print("\n");
		}
	}
	public void show(){
		Scanner input =new Scanner(System.in);
		System.out.print("����������������");
		row=input.nextInt();
		System.out.print("��������Ҫ��ӡ�������ַ���");
		String ch=input.next();
		printTriangle(row, ch);
	}
	
}
