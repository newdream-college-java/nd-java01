/*
创建GoodLock实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即可
*/
import java.util.Random;

public class 1{
	public static void main(String[] args){
		Random rd = new Random();
		int b = rd.nextInt(10);			//循环10次是为了检测程序运行吃否会有正确的结果
		for(int i=0;i<10;i++){
		b = rd.nextInt(10);
		System.out.println(b);
		}				//如果百位的数==随机抽取的数则获奖.
			
	}
}