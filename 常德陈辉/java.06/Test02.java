/*开发一个标题为“FlipFlop”的游戏应用程序。它从1计数到100，遇到3倍数就输入单词“Flip”，遇到5的倍数就输入单词“Flop”，既为3的倍数也为5的倍数就输出“FlipFlop”，其余情况就输出当前数字。*/
public class Test02{
	public static void main(String[] args){
	int i;
	for(i=1;i<101;i++){
		if(i%3==0&&i%5==0){
			System.out.println("FlipFlop");
			}else if(i%3==0){
			System.out.println("Filp");
			}else if(i%5==0){
			System.out.println("Flop");
			}else{
			System.out.println(i);
			}
		}
	}

}