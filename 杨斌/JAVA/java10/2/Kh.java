package zuoye;
import java.util.Scanner;
public class Kh {
	int jf;
	String name;
	public void hk(){
		Scanner input=new Scanner(System.in);
		System.out.print("���֣�");
		jf=input.nextInt();
		System.out.print("�����ͣ�");
		name=input.next();
		if(name.equals("��")){
			if(jf>1000){
				int f=500;
				System.out.print("�������֣�"+f);
				jf=jf+f;
			}else{
				int f=0;
				System.out.print("�������֣�"+f);
				jf=jf+f;
			}
		}else if(name.equals("�տ�")){
			if(jf>5000){
				int f=500;
				System.out.print("�������֣�"+f);
				jf=jf+f;
			}else{
				int f=0;
				System.out.print("�������֣�"+f);
				jf=jf+f;
			}
		}else{
			System.out.print("�������");
		}
	
	}
}
