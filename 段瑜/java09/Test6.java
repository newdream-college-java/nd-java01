import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a;
		a=new int[10];
		int b=0,c=0;
		for(int i=0;i<a.length;i++){
			System.out.print("请输入一个整数：");
			a[i]=input.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==1||a[i]==2||a[i]==3){
				b+=1;
			}else{
				c+=1;
			}
		}
		System.out.print("整数的个数为："+b+"\n非法数的个数为："+c);
	}
}