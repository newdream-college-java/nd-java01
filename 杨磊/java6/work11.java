//��Ա��֤
import java.util.*;
public class work11{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("���������룺");
			String b= input.next();
			if(b.equals("123456")){
				System.out.print("������ȷ��");
			}else{
				System.out.print("����������������룡�㻹��"+(3-i)+"�λ��ᣡ");
			}
		}
	}
}