/*猴子摘了一堆枣N个，第一天吃了一半，还嫌不过瘾，有多吃了一个；第二天又吃了剩下的一半零一个；以后每天如此，到第十天，猴子看只剩下一个了。问最初有多少枣子？*/
public class Test03{
	public static void main(String[] args){
	int N=1;
	for(int i=1;i<10;i++){
		N=(N+1)*2;
		}
	System.out.print("最初有"+N+"个枣子");
	}

}