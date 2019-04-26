import java.util.Scanner;
public class Zy6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int h=0,b=0;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"数");
			int a=input.nextInt();
			if(a==1||a==2||a==3){
				h++;
			}else{
				b++;
			}
		}
		System.out.println("合法的有"+h+"个\n"+"不合法 的有"+b+"个");
	}

}
