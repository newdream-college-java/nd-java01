import java.util.Scanner;
public class Z6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("请输入十个整数:");
		int b=0,c=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
			if(arr[i]==1||arr[i]==2||arr[i]==3){
				b++;
			}else{
				c++;
			}
			
		}
		System.out.print("整数有"+b+"个"+"\n非法整数有"+c+"个");
		

	}

}
