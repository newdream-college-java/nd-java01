import java.util.Scanner;
public class Zy9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i,a,b=10;
		for(i=1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			a=input.nextInt();
			if(a>=30){
				b--;
			}
			
		}
		
		int c=10-b;
		int d=10-c;
		c=c*10;
		d=d*10;	
		System.out.println("30�����µı����ǣ�"+d+".0%");
		System.out.println("30�����ϵı����ǣ�"+c+".0%");
	}
}