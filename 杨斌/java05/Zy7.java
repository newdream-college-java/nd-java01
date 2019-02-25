import java.util.Scanner;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i!=0){
			System.out.print("请输入一个整数");
			int a=input.nextInt();
			i++;
			if(a>0){
				if(1<=a&&a<=7){										
					if(a==1){
						System.out.println("1：MON");
						
					}else if(a==2){
						System.out.println("2：TUE");
						
					}else if(a==3){
						System.out.println("3：WED");
						
					}else if(a==4){
						System.out.println("4：THU");
						
					}else if(a==5){
						System.out.println("5：FRI");
						
					}else if(a==6){
						System.out.println("6：SAT");
						
					}else{
						System.out.println("7：SUN");
					}	
							
				}else{
					System.out.println("输入错误重新输入：");
				}

			}else{
					i=0;
			}
			
			
			
			


		}

	}


}