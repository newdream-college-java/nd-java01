package Test03;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		String[] arr=new String[5];
		System.out.println("欢迎您来到汽车租凭公司！");
		System.out.print("顾客请输入您的姓名：");
		String name=input.next();
		System.out.print("请输入要租凭的天数：");
		int ts=input.nextInt();
		String a;
		int i=0;
		int sum=0;
		do{
			System.out.print("请输入要租凭的汽车类型(1,轿车  2,客车3,东风):");
			int lx=input.nextInt();
			MotoVehicle cz=new Bus();
			if(lx==1){
				cz.shuchu();
			}else if(lx==2){
				cz=new Car();
				cz.shuchu();
			}else{
				cz=new Dongf();
				cz.shuchu();
			}
			if(arr[i]==null){
				arr[i]=cz.getNo()+"\t"+cz.getBrand();
			}
			i++;
			sum+=cz.getFy()*ts;
			System.out.print("是否继续租车：(y/n)");
			a=input.next();
		}while(a.equals("y"));
		System.out.println("汽车牌号\t\t汽车品牌");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("客户姓名："+name+"，租凭天数："+ts+",租凭总费用："+sum);
	}

}
