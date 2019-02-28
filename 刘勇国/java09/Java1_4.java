import java.util.Arrays;
import java.util.Scanner;
public class Java1_4{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		char[] arr=new char[9];
		char m1;
		char m2;
		int h=0;
		arr[0] ='a';
		arr[1] ='c';
		arr[2] ='u';   
		arr[3] ='b';
		arr[4] ='e';
		arr[5] ='p';
		arr[6] ='f';
		arr[7] ='z';
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		Arrays.sort(arr);
		System.out.println("\n排顺序后");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n请输入一个字符");
		String m=input.next();
		if(m.equals("m")){
			m1='m';
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>'m'){
				//找到m插入的位置
				m2=arr[i-1];
				for(int j=0;j<i-1;j++){
					arr[j]=arr[j+1];
				h=i-1;
				}
				arr[i-1]='m';
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n插入的位置是下标为"+h);
	}
}