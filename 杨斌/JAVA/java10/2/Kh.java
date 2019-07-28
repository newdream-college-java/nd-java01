package zuoye;
import java.util.Scanner;
public class Kh {
	int jf;
	String name;
	public void hk(){
		Scanner input=new Scanner(System.in);
		System.out.print("积分：");
		jf=input.nextInt();
		System.out.print("卡类型：");
		name=input.next();
		if(name.equals("金卡")){
			if(jf>1000){
				int f=500;
				System.out.print("回馈积分："+f);
				jf=jf+f;
			}else{
				int f=0;
				System.out.print("回馈积分："+f);
				jf=jf+f;
			}
		}else if(name.equals("普卡")){
			if(jf>5000){
				int f=500;
				System.out.print("回馈积分："+f);
				jf=jf+f;
			}else{
				int f=0;
				System.out.print("回馈积分："+f);
				jf=jf+f;
			}
		}else{
			System.out.print("输入错误");
		}
	
	}
}
