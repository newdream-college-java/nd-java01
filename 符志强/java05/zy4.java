import java.util.Scanner;
public class zy4{
	public static void main(String[] args){
		System.out.println("�������������");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		while(name.equals("��������")){
			System.out.println("�������������");
			 name=input.next();
		}
		System.out.println("�������ԭ���У�"+name);
	}
}