import java.util.Scanner;
public class Triangle {
	int row;
	String ch;
	public void show(){
		Scanner input =new Scanner(System.in);
		System.out.print("�������иߣ�");
		row=input.nextInt();
		System.out.print("�������ӡ���ַ���");
		String ch=input.next();
		printTriangle(row, ch);
	}
	public void printTriangle(int row,String ch){
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch);
			}
			System.out.print("\n");
		}
	}
}