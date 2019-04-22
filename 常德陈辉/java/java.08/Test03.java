/*循环365天，每天吃三次饭，要求使用嵌套循环来完成。第一天就输出“总算又过去了一天”，然后这一天里要求输出“我吃了一顿饭”三次*/
public class Test03{
	public static void main(String[] args){
	for(int i=1;i<=365;i++){
		System.out.println("总算又过去了一天");
		for(int j=1;j<=3;j++){
			System.out.println("我吃了一顿饭\n");
		}
	}
	}
}