/*循环输入商品编号，显示对应的商品价格，输入“n”结束循环。*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请选择购买的商品编号：\n1.T 恤\t2.网球鞋\t3.网球拍\n*************************");
	System.out.print("\n请输入商品编号：");
	String a=input.next();
	int i;
	for(;!a.equals("n");){
		switch(a){
			case "1":
				System.out.println("T 恤\t￥245");
				break;
			case "2":
				System.out.println("网球鞋\t￥570");
				break;
			case "3":
				System.out.println("网球拍\t￥320");
				break;
			}
		System.out.println("是否继续（y/n)");
		a=input.next();
		if(!a.equals("n")){
			System.out.print("请输入商品编号：");
			a=input.next();
			}
		}
	System.out.print("程序结束");
	}

}