import java.util.Scanner;
public class Z6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������0��������");
		int n=input.nextInt();
	 	int os=0,js=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				os++;
			}else{
				js++;
			}
			
		}
		System.out.print("1��"+n+"����"+js+"������"+os+"��ż��");
	}
}