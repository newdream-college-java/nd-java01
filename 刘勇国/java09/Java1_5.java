import java.util.Scanner;
public class Java1_5{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		double []score = new double[10];
		double max=score[0];
		double min=score[0];
		for(int i=0;i<10;i++){
			System.out.println("请输入第"+i+"个学生的成绩");
			score[i]=input.nextDouble();
			if(score[i]>max){
				max=score[i];
			}else{
				min=score[i];
			}

		}
		System.out.println("最高成绩为："+max+"\t最低成绩为："+min);
	}
}