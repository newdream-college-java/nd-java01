//猴子摘枣了一堆枣N个，第一天吃了一半加一个，第二天吃了一半加一个，问：持续10天共吃了多少。

public class C{
	public static void main(String[] arge){
		int s = 1;
		for(int i = 1; i<10;i++){
			s=(s+1)*2;
		}
		System.out.println(s);
	}
}