import java.util.Scanner;
public class A01{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		//System.out.print("请输入5名同学的成绩");
		//int b =input.nextInt();
		int sum=0;//分数大于80的人数		
		for(int i=1;i<6;i++){
		    //sum=0;//大于80的人数
			System.out.print("请输入第"+i+"同学的成绩");
			int b = input.nextInt();//输入分数
			if(b>80){
				sum++;
			}
			
		}System.out.println("大于80的人数为："+sum);
	}
}