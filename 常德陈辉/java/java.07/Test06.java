/*输入一个整数n,统计1到n中有多少个奇数和偶数。*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入一个整数");
	int n=input.nextInt();
	int j=0,o=0;
	for(int i=1;i<=n;i++){
		if(i%2==0){
			o++;
			}else{
			j++;
			}
		}
	System.out.print("奇数有"+j+"个"+"\t偶数有"+o+"个");
	}

}