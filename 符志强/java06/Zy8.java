import java.util.Scanner;
public class Zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������༶����");
		int b=input.nextInt();
		//count  ������ͳ�Ƶı�����
		int count=0;
		for(int i=1;i<=b;i++){
			System.out.println("�������"+i+"���˵ĳɼ�");
			double a=input.nextDouble();
		/*	if(a>80){
				count++;
			}
		*/

			if(a<=80){
				continue;
			}
			count++;	
		}
		System.out.println("����80�ֵ���"+b+"��"+count*1.0/b*100+"%");
	}
}