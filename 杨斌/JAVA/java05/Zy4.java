import java.util.Scanner;
public class Zy4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������ֽ�ʲô");
		String name=input.next();
		while(name.equals("��������")){
			System.out.print("������ֽ�ʲô");
			name=input.next();

		}
		System.out.print("�������ԭ���У�"+name);



	}

}