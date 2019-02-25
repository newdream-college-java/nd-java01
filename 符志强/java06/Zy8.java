import java.util.Scanner;
public class Zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入班级人数");
		int b=input.nextInt();
		//count  用于做统计的变量名
		int count=0;
		for(int i=1;i<=b;i++){
			System.out.println("请输入第"+i+"给人的成绩");
			double a=input.nextDouble();
		/*	if(a>80){
				count++;
			}
		*/

			if(a<=80){
				continue;
			}
			count++;	
		}
		System.out.println("大于80分的有"+b+"人"+count*1.0/b*100+"%");
	}
}