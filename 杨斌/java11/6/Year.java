import java.util.Scanner;
public class Year {
	int year;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.print("���������:");
		year=input.nextInt();
		if(year%4==0&&year%100!=0||year%100==0){
			System.out.print(year+"��������");
		}else{
			System.out.print(year+"����ƽ��");
		}
	}
}
