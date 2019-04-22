/*从键盘上输入10个整数，合法值为1、2、3。不是这3个数则为非法数字。编程统计每个整数和非法数字的个数*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
		int a=10;
		int b=0,c=0;
		int[] arr=new int[a];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个整数：");
			arr[i]=input.nextInt();
			if(arr[i]==1||arr[i]==2||arr[i]==3){
				b++;
			}else{
				c++;
			}
		}
		System.out.print("合法值有："+b+"个\t非法数字有："+c+"个");
	}
}