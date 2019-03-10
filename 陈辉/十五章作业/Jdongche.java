package java15;
import java.util.Scanner;
public class Jdongche {
	private  int type;	
	private  int money;
	private  int day;
	public void setType(int type){
		this.type=type;

	}
	public void setDay(int day){
		this.day=day;
	}
	public int getDay(){
		return day;
	}
	public void setMoney(int money){
		this.money=money;
	}
	public int getMoney(){
		return money;
	}
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入需要租赁多少天：");
		day=input.nextInt();
	}
	public void show4(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要租赁的汽车类型（1.轿车 2.客车）：");
		setType(input.nextInt());
	}
	//根据客户租用的天数来计算费用方法-----抽象方法
	//public String getBrand(int days);
} 