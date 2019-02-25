/*输入三个int型的数据，放入到a，b，c三个变量中去，使用条件结构与交换逻辑将这三个变量从小到大排列。*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入三个整数");
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a<b&&a<c){
		if(b<c){
			System.out.print(a+"<"+b+"<"+c);
			}else{
			System.out.print(a+"<"+c+"<"+b);
			}
		}else if(b<a&&b<c){
		if(a<c){
			System.out.print(b+"<"+a+"<"+c);
			}else{
			System.out.print(b+"<"+c+"<"+a);
			}
		}else if(c<a&&c<b){
		if(a<b){
			System.out.print(c+"<"+a+"<"+b);
			}else{
			System.out.print(c+"<"+b+"<"+a);
			}	
		}
	}

}