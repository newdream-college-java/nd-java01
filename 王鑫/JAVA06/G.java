/*开发一个标题为“FlipFlop”的游戏应用程序。它从1计数到100，遇到3的倍数就输出单词“Flip”，遇到5的倍数输出“Flop”，
既为3的倍数也是5的倍数输出“FlipFlop”，其余情况输出当前数字。
*/

public class G{
	public static void main(String[] arge){
		for(int i = 1 ; i<100 ; i++){
			if(i%3==0){
				 System.out.println("Flip");
			}else if(i%5==0){
				System.out.println("Flop");
			}else if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
			}else{
			System.out.println(i);
			}
		}
	}
}

