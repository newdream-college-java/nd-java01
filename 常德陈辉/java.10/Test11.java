
import java.util.Scanner;
public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// TODO Auto-generated method stub
		Test01 gl=new Test01();
		Test12 gl2=new Test12();
		System.out.print("�������û�����");
		String name=input.next();
		System.out.print("���������룺");
		int mm=input.nextInt();
		if(name.equals(gl.name)&&mm==gl.mm||name.equals(gl2.name)&&mm==gl2.mm){
			System.out.println("�����������룺");
			gl.name=input.next();
			System.out.println("�������޸ĳɹ�������Ϊ��"+gl.name);
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ");
		}
	}

}
