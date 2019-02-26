import java.util.*;
public class work8{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int j = 0;
		for(int i = 1;i<=5;i++){
			System.out.print("输入第"+i+"个同学的成绩：");
			int a = input.nextInt();
			if(a>80){
				j++;
			}else{
				continue;
			}
		}
		System.out.print("这五个同学的成绩有"+j+"个大于80！");
	}
}