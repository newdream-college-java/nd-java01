import java.util.Scanner;
public class Ak{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("＊＊＊＊＊＊＊＊消费单＊＊＊＊＊＊＊＊");
	System.out.println("购买物品\t单价\t个体\t金额\nT恤\t\t￥245\t2\t￥490\n网球鞋\t\t￥570\t1\t￥570\n网球拍\t\t￥320\t1\t￥320\n\n");
	double a,b,c,d;
	a=490+570+320;
	b=a*0.8;
	c=1500-b;
	d=b/100*3;
	d=(int)d;
	System.out.print("这口\t\t8折\n消费总金额\t￥"+b+"\n实际缴费\t￥1500\n找钱\t\t￥"+c+"\n本次购物获得的积分是："+d);
	}

}