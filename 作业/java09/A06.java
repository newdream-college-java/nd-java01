import java.util.Scanner;
public class Java1_6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int []arr = new int[10];
		int hefa=0;
		int feifa=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个数字");
			arr[i]=input.nextInt();
			if(arr[i]==1||arr[i]==2||arr[i]==3){
				System.out.println("合法字符");
				hefa++;
			}else{
				System.out.println("非法字符");
				feifa++;
			}

		}
		System.out.println("合法字符共"+hefa+"非法字符"+feifa);
	}
}