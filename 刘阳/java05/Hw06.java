import java.util.Random;
import java.util.Scanner;
public class Hw06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd= new Random();
		int pk=rd.nextInt(3)+1;
		System.out.println("����������������ƣ�"+"\n1.ʯͷ"+"\n2.����"+"\n3.��");
		int a =input.nextInt();
		if(a==1&&pk==1){
			System.out.print("�����ʯͷ�����Գ���ʯͷ��----ƽ��");
		}else if(a==1&&pk==2){
			System.out.print("�����ʯͷ�����Գ��˼�����----��ϲ����Ӯ�ˣ�");
		}else if(a==1&&pk==3){
			System.out.print("�����ʯͷ�����Գ��˲���----���ź��������ˣ�");
		}
		if(a==2&&pk==1){
			System.out.print("����˼��������Գ���ʯͷ��----���ź��������ˣ�");
		}else if(a==2&&pk==2){
			System.out.print("����˼��������Գ��˼�����----ƽ��");
		}else if(a==2&&pk==3){
			System.out.print("����˼��������Գ��˲���----��ϲ����Ӯ�ˣ�");
		}
		if(a==3&&pk==1){
			System.out.print("����˲������Գ���ʯͷ��----��ϲ����Ӯ�ˣ�");
		}else if(a==3&&pk==2){
			System.out.print("����˲������Գ��˼�����----���ź��������ˣ�");
		}else if(a==3&&pk==3){
			System.out.print("����˲������Գ��˲���----ƽ��");
		}
	}	
}