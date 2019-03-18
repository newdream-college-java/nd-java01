package java16;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 上一张我们已经实现了汽车租赁系统的简单计价功能，
 * 客户可以租赁一辆某种型号的汽车若干天。现在增加业务需求，
 * 客户可以租赁多辆不同品牌的不同型号的汽车若干天（一个客户租赁的各汽车的租赁天数相同），
 * 要求计算出总租赁价
 * 
 * 
 * 增加租赁卡车业务，租赁费用用吨位计算，每吨每天计价50元
 * 要求对系统进行扩展，计算汽车租赁的总租金
 * @author mo
 *
 */
public class Test03 {
	public static void main(String[] args) {
		List<MotoVehicle> motoVehicles=new ArrayList<MotoVehicle>();
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到汽车租赁公司！");
		System.out.print("请输入租赁天数:");
		int days=input.nextInt();
		MotoVehicle motoVehicle=null;
		do {
			System.out.print("请输入要租赁的汽车类型（1.轿车 2.客车 3.卡车）");
			int motoVehicleType=input.nextInt();
			if(motoVehicleType==1) {
				motoVehicle=new Car();
				System.out.print("请选择要租赁的轿车品牌:(1.宝马 2.别克)");
				int carBrand=input.nextInt();
				if(carBrand==1) {
					motoVehicle.setBrand("宝马");
					((Car)motoVehicle).setType("宝马");
					motoVehicle.setNo("湘NNN4324");
				}else {
					motoVehicle.setBrand("别克");
					System.out.print("请输入要租赁的别克类型：（1.林荫大道 2.商务车GL8）");
					int type=input.nextInt();
					if(type==1) {
						((Car)motoVehicle).setType("林荫大道");
						motoVehicle.setNo("湘NY298588");
					}else if(type==2) {
						((Car)motoVehicle).setType("GLB");
						motoVehicle.setNo("湘NNN3284");
					}
					
				}
			}else if(motoVehicleType==2){
				motoVehicle=new Bus();
				System.out.print("请输入要租赁的客车类型:(1.金杯 2.金龙)");
				int busType=input.nextInt();
				if(busType==1) {
					motoVehicle.setBrand("金杯");
				}else if(busType==2) {
					motoVehicle.setBrand("金龙");
				}
				System.out.print("请输入要租赁的座位数量(1.<=16 2.>16)");
				int seatCount=input.nextInt();
				if(seatCount==1) {
					((Bus)motoVehicle).setSeatCount(16);
					motoVehicle.setNo("湘NT43765");
				}else if(seatCount==2) {
					((Bus)motoVehicle).setSeatCount(32);
					motoVehicle.setNo("京564765");
				}
			}else if(motoVehicleType==3) {
				motoVehicle=new Truck();
				motoVehicle.setBrand("东风");
				System.out.print("请输入所需要的重量:");
				int weight=input.nextInt();
				((Truck)motoVehicle).setWeight(weight);
				motoVehicle.setNo("粤AU7865");
				
			}
			motoVehicles.add(motoVehicle);
			System.out.print("请选择是否继续租赁其它车型：（y/n）");
			String answer=input.next();
			if(answer.equals("n")) {
				break;
			}
		}while(true);
		System.out.println(motoVehicles.size());
		System.out.println("汽车牌号\t\t汽车品牌");
		for(int i=0;i<motoVehicles.size();i++) {
			System.out.println(motoVehicles.get(i).getNo()+"\t\t"+motoVehicles.get(i).getBrand());
		}
		System.out.println("租赁天数："+days+",租赁总费用："+calAllRent(motoVehicles, days));
	}
	public static int calAllRent(List<MotoVehicle> motoVehicles,int days) {
		int sum=0;
		for(int i=0;i<motoVehicles.size();i++) {
			sum+=motoVehicles.get(i).calcRent(days);
		}
		return sum;
	}
}
