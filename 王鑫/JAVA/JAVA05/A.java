// 输出计算100+101+102+...+200之和

public class A{
	public static void main(String[] args){
		int i=100 , sum=0;
		do{
			sum+=i++;
		}while(i<=200);
		System.out.print("100+101+102....+200="+sum);
	}
}