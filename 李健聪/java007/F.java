import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int os=0,js=0;
		System.out.println("����һ��������ͳ��1���������ж��ٸ�������ż��");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
			if(i%2==0){
			os++;
			}if(i%2==1){
			js++;
			}
		}System.out.println(a+"����"+js+"������\tż����"+os+"��");

	}
}