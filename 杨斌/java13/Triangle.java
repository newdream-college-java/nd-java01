import java.util.Scanner;
public class Triangle {
	int row;
	String ch;
	public void show(){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入行高：");
		row=input.nextInt();
		System.out.print("请输入打印的字符：");
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