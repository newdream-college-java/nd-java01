import java.util.Scanner;
public class AA{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int sum=0;
		double avg;
		
		for(int i=1;i<=5;i++){
			System.out.println("���������ĳɼ�");
			int a=input.nextInt();
			sum=sum+a;
			
		}
			System.out.println("ƽ���ɼ�Ϊ"+(avg=sum/5));
	}
}