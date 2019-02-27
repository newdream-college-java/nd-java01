/*循环365天，每天吃三次饭，过一天就输出又过了一天，每天输出吃了三顿饭*/
public class Work3{
	public static void main(String []args){
		for(int i=1;i<=365;i++){
			for(int j=1;j<=3;j++){
				System.out.println("我吃了一顿饭！");
			}
			System.out.println("总算又过了一天！"+i);
		
		}	
	}
}