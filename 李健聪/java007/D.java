import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int jzs=0,jfs=0,jl=0;	
		System.out.println("请输入一个数");
		
			for(int i=0;;i++){
				
				int a=input.nextInt();
				if(a==999){
					System.out.println("正数有"+jzs+"个\t负数有"+jfs+"个\t0有"+jl+"个");
					System.exit(-1);	
				}
				if(a>0){
					jzs++;
					System.out.println("请重新输入一个数");
				}if(a==0){
					jl++;
					System.out.println("请重新输入一个数");
				}if(a<0){
					jfs++;
					System.out.println("请重新输入一个数");
				}
			}
		
	}
}