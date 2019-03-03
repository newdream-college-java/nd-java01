import java.util.Scanner;
public class Java02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String aArray[] = new String[10];
		int i=0;
		while(true){
			System.out.println("请输入任意文字");
			aArray[i]=input.next();
			if(aArray[i].equals("Esc")){
			break;
			}
			i++;
		}
		for(int j=0;j<=i-1;j++){
			System.out.print(aArray[j]);
		}
	}
}