import java.util.Scanner;
public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入3个整数：\t");
		int  a = input.nextInt();
		int  b = input.nextInt();
		int  c = input.nextInt();
		if(a>b){
			if(a>c){
			 	if(b>c){
					System.out.print(a+">"+b+">"+c);
				}else{
					System.out.print(a+">"+c+">"+b);
				}
			}else{
				System.out.print(c+">"+a+">"+b);
			}
		}else if(b>c){
			if(a>c){
				System.out.print(b+">"+a+">"+c);
			}else{
				System.out.print(b+">"+c+">"+a);
			}
		}else{
			System.out.print(c+">"+b+">"+a);
		}
	}
}