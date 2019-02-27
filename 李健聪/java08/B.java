import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			int a=input.nextInt();
			if(!(a>80)){
				continue;
			}else	count++;
		}System.out.println("有"+count+"个同学超过80分");	
	}
}