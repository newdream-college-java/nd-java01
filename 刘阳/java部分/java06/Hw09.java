import java.util.Scanner;
public class Hw09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������˿͵�����");
		//ѭ������˿�����
		int yo=input.nextInt();
		int i,a=0;//30�����ϵ�����
		for(i=1;i<10;i++){
			if(yo>=30){
				a++;
			}
			System.out.print("������˿͵�����");
			yo=input.nextInt();
		}
		System.out.print("30�����µı����ǣ�"+(10-a)/10.0*100+"%"+"\n"+"30�����ϵı����ǣ�"+(a/10.0*100)+"%");
	}
}










