import java.util.Scanner;
public class Java02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("�������"+i+"��ͬѧ�ĳɼ�");
			double score = input.nextDouble();
			if(score<=80){				
				continue;
			}
			sum++;
		}
		System.out.println(sum);
	}
}