package java14;
import java.util.Scanner;
public class Kzhitai {
		//public static void main(String[]args){ 
	public void show(){
			Scanner input=new Scanner("System.in");
			System.out.println("欢迎来到宠物店！！！");
			System.out.println("请输入你要领养的宠物名字");
			String xb=input.next();
			
			System.out.println("请选择领养的宠物类型1：狗狗，2：企鹅");
			int bo=input.nextInt();
			if(bo==1){
				
				System.out.println("选择的狗狗");
			}else if(bo==2){
				System.out.println("选择的是企鹅");
			}else{
				System.out.println("选择错误");
			}
			System.out.println("请选择狗狗的品种1：聪明的拉布拉多犬2：酷酷的雪娜瑞");
			int po=input.nextInt();
			if(po==1){
				System.out.println("选择的是聪明的拉布拉多");
			}else if(po==2){
				System.out.println("选择的是酷酷的雪娜瑞");
			}else{
				System.out.println("选择错误");
			}
			System.out.println("我的名字叫："+xb+"健康值是："+100+"和主人的亲密度为："+80+"我是一只聪明的拉布拉多");
		}
}				


