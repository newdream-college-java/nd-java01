import java.util.Scanner;
public class Zy6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����һ����");
		int n=input.nextInt();
		int j=0,o=0;
		while(n>0){
			
			if(n%2==0){
				o++;
			}
			if(n%2!=0){
				j++;
			}
			
			n=input.nextInt();	
		}
		System.out.print("�����ĸ���"+j+"\nż���ĸ���"+o);
	}
}