import java.util.Scanner;
public class A06{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int m=0,k=0;
		for(int i=1;i<11;i++){
			int a =input.nextInt();
			if(a==1||a==2||a==3){
				m++;
				System.out.println("�Ϸ�ֵ:"+m);
			}else{
				k++;
				System.out.println("�Ƿ��ַ�����Ϊ:"+k);
			}
		}
	}
}