import java.util.Scanner;
public class Zy6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int h=0,b=0;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"��");
			int a=input.nextInt();
			if(a==1||a==2||a==3){
				h++;
			}else{
				b++;
			}
		}
		System.out.println("�Ϸ�����"+h+"��\n"+"���Ϸ� ����"+b+"��");
	}

}
