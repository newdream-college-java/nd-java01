\*����һ������n��ͳ��1��n���ж��ٸ��������ٸ�ż��*\
import java.util.Scanner;
public class Hw06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		System.out.println("������һ��������");
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2==0){
				count++;
			}else{
				continue;
			}
		}
		System.out.print("1~"+n+"����"+count+"��ż����"+(n-count)+"������");
	}	
}