/*用户可以无限次的输入数字，请统计用户输入分数字中正数的个数，负数的个数，0的个数。直到用户输入999就结束，输出统计结果*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int a=0,b=0,c=0;
        int num=-1;
	do{
		System.out.print("请输入数字：");
		num=input.nextInt();
		if(num>0){
			a++;
			}else if(num==0){
				b++;
			}else{
				c++;
			}
		}while(num!=999);
	System.out.print("正数的个数为："+a+"\n0的个数为："+b+"\n负数的个数为："+c);
	}

}