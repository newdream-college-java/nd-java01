import java.util.Scanner;


public class Testka {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// TODO Auto-generated method stub
		Ka ka=new Ka();
		ka.jf=3050;
		ka.lx=input.next();
		ka.show();
		int sum=0;
		if(ka.lx.equals("��")){
			if(ka.jf>1000){
				sum=500;
				System.out.print("��������"+sum+"��");
			}else{
				System.out.print("���ֲ���");
			}
		}else{
			if(ka.jf>5000){
				sum=500;
				System.out.print("��������"+sum+"��");
			}else{
				System.out.print("���ֲ���");
			}
		}
	}

}
