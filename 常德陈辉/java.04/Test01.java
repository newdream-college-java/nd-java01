/*����ȥ���ң������3�����£��ϰ�Ͳ����ң������3����5��������һ���ң������5�����Ͼ���2���ң�����Ҫ��������ӵ����������������������˼����ҡ�*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������Ҫ�򼸸��ң�");
	int number=input.nextInt();
	if(number<3){
		System.out.print(number+"��");
		}else if(number>=3&&number<=5){
			number--;
			System.out.print(number+"��");
			}else if(number>5){
				number-=2;
				System.out.print(number+"��");
				}
	}

}