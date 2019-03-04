import java.util.Scanner;


public class zuoye4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int df=0,zf=0,gf=0,sum=0;
		double avg=0;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"个同学的成绩");
			int a=input.nextInt();
			if(a<60){
				df++;
				sum+=a;
			}else if(a>=60&&a<80){
				zf++;
				sum+=a;
			}else{
				gf++;
				sum+=a;
				
			}
		}System.out.println("60分以下的有"+df+"个    60~80分的有"+zf+"个    80分以上的有"+gf+"个");
		System.out.println("总分为"+sum);
		avg=sum*1.0/10;
		System.out.println("平均分为"+avg);
	}

}
