import java.util.Scanner;
public class A01 {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		double he=0;
		for(int i =1;i<6;i++){
			//double arr=input.nextDouble();
			System.out.println("��"+i+"�����Ѽ�¼");
			double arr=input.nextDouble();
			//he=arr+he;
			/*for(int j=1;j<6;j++){
				System.out.println("���"+i);
				break;
			}*/

		}for(int j=1;j<6;j++){
				
				System.out.println("���"+j);
				double arr=input.nextDouble();
				he=arr+he;
				
			}

			
			System.out.println(he);
	}
}