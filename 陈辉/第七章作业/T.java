import java.util.Scanner;
public class T{
	public static void main(String [] args){
		while(true){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n=in.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum1++;}
				else