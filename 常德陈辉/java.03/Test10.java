/*������GoodLuckʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա*/
import java.util.Random;
import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������4λ��Ա��");
	int a=input.nextInt();
	Random rd=new Random();
	int num=rd.nextInt(9);
	int b;
	b=a/100%10;
	if(num==b){
		System.out.print("�����Ϊ"+num+"\t"+a+"�ŵĿͻ������˿ͻ�����þ���Mp3һ��");
		}else{
		System.out.print("�����Ϊ"+num+"\t"+a+"�ſͻ���лл����֧��");
		}
	}

}