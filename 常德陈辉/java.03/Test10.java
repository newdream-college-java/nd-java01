/*创建类GoodLuck实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即为幸运会员*/
import java.util.Random;
import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入4位会员号");
	int a=input.nextInt();
	Random rd=new Random();
	int num=rd.nextInt(9);
	int b;
	b=a/100%10;
	if(num==b){
		System.out.print("随机号为"+num+"\t"+a+"号的客户是幸运客户，获得精美Mp3一个");
		}else{
		System.out.print("随机号为"+num+"\t"+a+"号客户，谢谢您的支持");
		}
	}

}