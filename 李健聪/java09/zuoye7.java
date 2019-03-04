import java.util.Arrays;
import java.util.Scanner;


public class zuoye7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] a={"Island","Ocean","Pretty","Sun"};
		System.out.print("插入前的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"   ");
		}
		System.out.print("\n请输入歌曲名称:");
		String b=input.next();
		String[] brr=new String[5];
		for(int i=0;i<brr.length;i++){
			brr[i]=a[i];
		}
		brr[brr.length-1]=b;
		Arrays.sort(brr);
		System.out.println("插入后的数组为：");
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+" ");
		}
	}

}
