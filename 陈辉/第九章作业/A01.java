import java.util.Scanner;
public class A01 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		double he=0;
		for(int i =1;i<6;i++){
			//double arr=input.nextDouble();
			System.out.println("第"+i+"个消费记录");
			double arr=input.nextDouble();
			//he=arr+he;
			/*for(int j=1;j<6;j++){
				System.out.println("序号"+i);
				break;
			}*/

		}for(int j=1;j<6;j++){
				
				System.out.println("序号"+j);
				double arr=input.nextDouble();
				he=arr+he;
				
			}

			
			System.out.println(he);
	}
}