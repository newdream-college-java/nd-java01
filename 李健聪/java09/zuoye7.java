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
		System.out.print("����ǰ������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"   ");
		}
		System.out.print("\n�������������:");
		String b=input.next();
		String[] brr=new String[5];
		for(int i=0;i<brr.length;i++){
			brr[i]=a[i];
		}
		brr[brr.length-1]=b;
		Arrays.sort(brr);
		System.out.println("����������Ϊ��");
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+" ");
		}
	}

}
