import java.util.Scanner;


public class RunYear {
	public void runYear(){
		Scanner ip=new Scanner(System.in);
		//��ʾ�������
		System.out.println("�����������ݣ�");
		int year=ip.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.print(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}
}
