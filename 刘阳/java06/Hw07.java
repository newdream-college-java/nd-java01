import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sum=0;
		System.out.println("��������Ҫ�ۼӵ����֣�");
		double num=input.nextDouble();
		for(;num>=0;){
			if(num>0){
			sum+=num;
			System.out.println("��������Ҫ�ۼӵ����֣�");
			num=input.nextDouble();
			}else{
				System.out.println("�ۼӽ��Ϊ��"+sum);
				break;
			}
		}
		
	}
}