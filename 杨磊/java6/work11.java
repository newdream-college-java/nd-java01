//会员验证
import java.util.*;
public class work11{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("请输入密码：");
			String b= input.next();
			if(b.equals("123456")){
				System.out.print("密码正确！");
			}else{
				System.out.print("密码错误，请重新输入！你还有"+(3-i)+"次机会！");
			}
		}
	}
}