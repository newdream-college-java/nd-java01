import java.util.Scanner;
public class Z4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("���������������������0��");
		int a=input.nextInt();
		int b=0,c=0,d=0;
		for(int i=1;i>=1;i++){
			
			if(a<0){
				b++;
			}else if(a==0){
				c++;
			}else if (a>0&&a!=999){
				d++;		
			}else{
				d++;
				break;
			}
			a=input.nextInt();
			
		}
		System.out.print("������"+b+"��\n"+"����"+c+"��\n"+"����"+d+"��");
	}
}