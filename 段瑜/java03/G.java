import java.util.Scanner;
public class G{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	
	int mun=input.nextInt();
	int a,b,c,sex;
	a=mun/100;b=mun/10%10;c=mun%10;
	sex=a;
	if(sex>b&&b>c){
		System.out.println(mun+"是降序数");
	}else{
		System.out.println(mun+"不是降序");
	
	}
}
}