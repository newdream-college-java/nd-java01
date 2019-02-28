/*开发一个标题为“FlipFlop”的游戏应用程序。它从1计数到100，
遇到3的倍数就输出单词“Flip”，遇到5的倍数就输出单词“Flop”，
既为3的倍数也为5的倍数就输出“FliFlop”,其余情况输出当前数字。*/
public class A02{
	public static void main(String[] args){
		System.out.println("FlipFlip游戏应用程序");
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
			}else if(i%5==0){
				System.out.println("Flop");
			}else if(i%3==0){
				System.out.println("Flip");
			}else{
				System.out.println(i);
			}
			
			
			
		}
	}
}