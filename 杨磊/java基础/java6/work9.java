import java.util.*;
public class work9{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
				int b=0,c=0;
		for(int i =1;i<=10;i++){
			System.out.print("�������"+i+"λ�˿͵����䣺");
			int a=input.nextInt();
			if(a>=30){
				b++;
			}else{
				c++;
			}
		}
		double d = 0,f=0;

		System.out.println("����30��ռ"+b/10.0);
		System.out.println("С��30��ռ"+c/10.0);
	}
}