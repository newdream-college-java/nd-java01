import java.util.Scanner;
public class Z4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请随机输入正数、负数、0：");
		int a=input.nextInt();
		int b=0,c=0,d=0;
		for(int i=1;i>=1;i++){
			
			if(a<0){
				b++;
			}else if(a==0){
				c++;
			}else if (a>0&&a!=999){
				d++;		
			}else{
				d++;
				break;
			}
			a=input.nextInt();
			
		}
		System.out.print("负数有"+b+"个\n"+"零有"+c+"个\n"+"正数"+d+"个");
	}
}