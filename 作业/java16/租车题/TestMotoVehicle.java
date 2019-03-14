package 第15章继承作业____2车辆租赁;

import java.util.Scanner;



public class TestMotoVehicle {
	Scanner input = new Scanner(System.in);
	MotoVehicle[] arr = new MotoVehicle[2];

	int days;//因为父类 MotoVehicle 是抽象类
	//Bus bus=new Bus(busBrand, seats, price, days);//在这里定义为成员变量
	//Car car = new Car(0, 0, null);//在这里定义为成员变量,否则无法存入引用数组。
	
	public void initial(){
		String answer;
		System.out.println("欢迎来到汽车租赁公司\n请选择租赁模式（1.租赁一辆车\t2.租赁多辆车）");
		int choice = input.nextInt();
		if(choice==1){
			//租赁一辆车
			//setDays();
			System.out.println("请输入要租赁的天数");
			days=input.nextInt();
			//choiceMotoType();
			System.out.println("请输入要租赁的汽车类型（1.轿车\t2.客车\t3.卡车）");
			choice =input.nextInt();
			if(choice==1){
				//轿车类型
				//choiceCarBrand();
				System.out.println("请输入要租赁的汽车品牌（1.宝马\t2.别克）");
				choice=input.nextInt();
				if(choice==1){
					//如果是宝马直接调用构造方法传参数，
					Car car = new Car(500, days, "宝马");
					car.calculateRent();
					car.show();
					car.setBrand("宝马");
				}else{
					//别克
					//选择别克的型号，不另外写方法直接执行
					System.out.println("请输入轿车的型号（2.商务舱GL8\t3.林荫大道）");
					int choiceBieKe=input.nextInt();
					if(choiceBieKe==2){
						Car car =new Car(600, days, "别克商务舱GL8");
						car.calculateRent();
						car.show();
						car.setBrand("别克商务舱GL8");
					}else{
						Car car =new Car(300, days, "别克林荫大道");
						car.calculateRent();
						car.show();
						car.setBrand("别克林荫大道");
					}
				}
			}else if(choice==2){
				//客车类型
				//choiceBusBrand();
				System.out.println("请输入要租赁汽车的类型（1.金杯<=16座\t2.金龙>16座）");
				int choiceBusBrand = input.nextInt();
				if(choiceBusBrand==1){
					//金杯<=16座
					Bus bus=new Bus("金杯", "<=16座", 800, days);
					bus.calculateRent();
					bus.setBrand("金杯");
					bus.show();
				}else{
					Bus bus=new Bus("金龙", ">16座", 1600, days);
					bus.calculateRent();
					bus.show();
					bus.setBrand("金龙");
				}
			}else{
				//卡车
				System.out.println("请输入要运载货物的重量(吨)");
				int weight=input.nextInt();
				Truck truck = new Truck("东风", 50,weight,days);
				truck.calculateRent();
				truck.show();
				truck.setBrand("东风");
			}
		}else{
			//创建一个父类机动车引用数组int[] arr = new int[2]
			MotoVehicle[] arr=new MotoVehicle[2];
			do{
				//setDays();
				System.out.println("请输入要租赁的天数");
				days=input.nextInt();
				//choiceMotoType();		
				System.out.println("请输入要租赁的汽车类型（1.轿车\t2.客车\t3.货车）");
				choice =input.nextInt();
				if(choice==1){
					//轿车类型choiceCarBrand();
					System.out.println("请输入要租赁的汽车品牌（1.宝马\t2.别克）");
					choice=input.nextInt();
					if(choice==1){
						//如果是宝马直接调用构造方法传参数，
						Car car = new Car(500, days, "宝马");
						car.calculateRent();
						car.show();
						car.setBrand("宝马");
						addMotoVichle(car);
					}else{
						//别克
						//选择别克的型号，不另外写方法直接执行
						System.out.println("请输入轿车的型号（2.商务舱GL8\t3.林荫大道）");
						int choiceBieKe=input.nextInt();
						if(choiceBieKe==2){
							Car car =new Car(600, days, "别克商务舱GL8");
							car.calculateRent();
							car.show();
							car.setBrand("别克商务舱GL8");
							addMotoVichle(car);
						}else{
							Car car =new Car(300, days, "别克林荫大道");
							car.calculateRent();
							car.show();
							car.setBrand("别克林荫大道");
							addMotoVichle(car);
						}
					}
				}else if(choice==2){
					//客车类型choiceBusBrand();
					System.out.println("请输入要租赁汽车的类型（1.金杯<=16座\t2.金龙>16座）");
					int choiceBusBrand = input.nextInt();
					if(choiceBusBrand==1){
						//金杯<=16座
						Bus bus=new Bus("金杯", "<=16座", 800, days);
						bus.calculateRent();
						bus.setBrand("金杯");
						bus.show();
						addMotoVichle(bus);
					}else{
						Bus bus=new Bus("金龙", ">16座", 1600, days);
						bus.calculateRent();
						bus.show();
						bus.setBrand("金龙");
						addMotoVichle(bus);
					}
				}else{
					System.out.println("请输入要运载货物的重量(吨)");
					int weight=input.nextInt();
					Truck truck = new Truck("东风", 50,weight,days);
					truck.calculateRent();
					truck.show();
					truck.setBrand("东风");
					addMotoVichle(truck);
				}
				System.out.println("要继续租车吗？（y/n）");
				answer=input.next();
			}while(answer.equals("y"));
			//for(int i=0;i<arr.length;i++){
				//System.out.println(arr[i].getNumber()+"\t\t"+arr[i].getBrand());
		//	}
				showMotos();
				showSumPay();
		}
	}
	public void showSumPay(){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].getMoney()!=0){
				sum+=arr[i].getMoney();
			}
		}
		System.out.println("您共需要支付"+sum);
	}
	public void addMotoVichle(MotoVehicle m){
		// int[] arr = new int[5]
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null){
				arr[i]=m;
				break;
				//数组存满了判断一次，不写了
			}
		}
	}
	public void showMotos(){
		System.out.println("车的品牌\t\t车牌号");
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null){
				System.out.println(arr[i].getBrand()+"\t\t"+arr[i].getNumber());
			}
		}
	}

}
