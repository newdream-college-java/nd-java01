/*�û��������޴ε��������֣���ͳ���û�����������������ĸ����������ĸ�����0�ĸ�����ֱ���û�����999�ͽ��������ͳ�ƽ��*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int a=0,b=0,c=0;
        int num=-1;
	do{
		System.out.print("���������֣�");
		num=input.nextInt();
		if(num>0){
			a++;
			}else if(num==0){
				b++;
			}else{
				c++;
			}
		}while(num!=999);
	System.out.print("�����ĸ���Ϊ��"+a+"\n0�ĸ���Ϊ��"+b+"\n�����ĸ���Ϊ��"+c);
	}

}