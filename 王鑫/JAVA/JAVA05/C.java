//编程使用while循环输出：100，95，90，...,5。

public class C{
	public static void main(String[] arge){
		int i=100;
		while(i>5){
		System.out.print(i+"，");
		i-=5;
		}
		System.out.print(i);
	}
}