import java.util.Scanner;
public class java09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int age1=0;
		int age2=0;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"λ�˿͵�����");
			int age =input.nextInt();
			if(age<=30){
				age1++;	
			}else{
				age2++;
			}
		}
		System.out.println("30�����µı����ǣ�"+(age1/10.0*100)+"%");
		System.out.println("30�����ϵı����ǣ�"+(age2/10.0*100)+"%");
	}
}