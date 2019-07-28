import java.util.Scanner;
public class Z1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Car car=new Car();
		Bus bus=new Bus();
		System.out.println("欢迎您来到汽车租凭公司！");
		System.out.println("请输入要租凭的天数：");
		int day=input.nextInt();
		System.out.println("请输入要租凭的汽车类型（1、轿车  2、客车）：");
		int a =input.nextInt();
		switch(a){
		case 1:
			car.setDay(day);
			car.setName("轿车");
			car.show();
			car.print();
			break;
		case 2:
			bus.setDay(day);
			bus.setName("客车");
			bus.show();
			bus.print();
			break;
		default:
			System.out.println("输入错误");
		}
		
		
	}

}
