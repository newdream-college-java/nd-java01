import java.util.Scanner;
import java.util.Random;
public class I{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random rd= new Random();	
	int sj=rd.nextInt(10);
	System.out.println("�������ع������ϵͳ>���˳齱"+"\n"+"\n");
	System.out.println("������4λ��Ա��:");
	int hyh=input.nextInt();
	int bw=hyh/100%10;
	if(bw==sj){
		System.out.print(hyh+"�ſͻ������˿ͻ��������Ʒһ��");
	}else{
		System.out.print(hyh+"��û��Ǯ����û�н�");
	}	
	
	
	}
} 