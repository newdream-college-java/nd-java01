import java.util.Scanner;


public class zuoye5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int count=0,coun=0;
		for(int i=1;i<=10;i++){
			int a=input.nextInt();
			if(a==1||a==2||a==3){
				count++;
			}else{
				coun++;
			}
		}System.out.println("10个整数中合法整数有"+count+"个     非法数字有"+coun+"个");
	}

}
