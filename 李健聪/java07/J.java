import java.util.Scanner;
public class J{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double avg=0,avg1=0,s=0,r=0;
		System.out.println("请分别输入10位顾客的年龄");
		for(int i=1;i<11;i++){
			System.out.println("请分输入第"+i+"位顾客的年龄");
			int a=input.nextInt();
			if(a>=30){
			s++;	
			}else{
			r++;	
			}avg=(s/i)*100;
			 avg1=(r/i)*100;
		}
		System.out.println("30岁以上的比例是"+avg+"%"+"\t30岁以下的比例是"+avg1+"%");
	}
}