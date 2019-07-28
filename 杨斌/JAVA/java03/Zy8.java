import java.util.Scanner;
public class Zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的会员账号:");
		int hy=input.nextInt();

		if(1000<=hy&&hy<=9999){
			System.out.print("请输入你的生日:");
			String sr=input.next();
			System.out.print("请输入你积分:");
			int jf=input.nextInt();
			System.out.print("你的会员账号为："+hy+"\n你的生日为："+sr+"\n你的积分为："+jf);


		}else{
			System.out.print("你输入的会员账号不对，请重新输入！");
		
		}


	}




}