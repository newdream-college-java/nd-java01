/*无限输入数字，遇到999停止输出结果，有多少正数负数和0*/
import java.util.Scanner;
public class Hw04{
	public static void main(String[] arg){
		Scanner input=new Scanner(System.in);
		int a=0,b=0,i;
		double num;
		for(i=1;;i++){
			System.out.print("请输入数字：");
			num=input.nextDouble();
			if(num!=999){
				if(num>0){
					a++;
				}else if(num<0){
					b++;
				}
			}else{
				System.out.println();
				break;
			}
		}
		System.out.print("有"+a+"个正数"+"\t有"+b+"个负数"+"\t有"+(i-a-b-1)+"个零");

	}
}