import java.util.Scanner;
public class Java06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int n= input.nextInt();
		int ji=0;
		int ou=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				ou++;
			}else{
				ji++;
			}
		}
		System.out.println("��������"+ji+"��\t\t"+"ż������"+ou+"��");
	}
}