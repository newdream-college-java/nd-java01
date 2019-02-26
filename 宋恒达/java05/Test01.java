/**
**Êä³ö100+101+102+......+200Ö®ºÍ
**/
public class Test01{
	public static void main(String[] args){
		int i=100;
		int sum=0;
		while(i<=200){
			sum+=i;
			i++;
		}
		System.out.println("100+101+102+...+200="+sum);
	}
}