/*�����������֣�����999ֹͣ���������ж�������������0*/
import java.util.Scanner;
public class Hw04{
	public static void main(String[] arg){
		Scanner input=new Scanner(System.in);
		int a=0,b=0,i;
		double num;
		for(i=1;;i++){
			System.out.print("���������֣�");
			num=input.nextDouble();
			if(num!=999){
				if(num>0){
					a++;
				}else if(num<0){
					b++;
				}
			}else{
				System.out.println();
				break;
			}
		}
		System.out.print("��"+a+"������"+"\t��"+b+"������"+"\t��"+(i-a-b-1)+"����");

	}
}