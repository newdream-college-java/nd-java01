import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ¼���û�������");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
			System.out.println("�������"+i+"�û��ı��(<4λ����>)");
			int b=input.nextInt();
			for(;;){
				if(b/1000>0&&b/1000<10){
					System.out.println("������������ȷ�ı��");
				b=input.nextInt();
				}else{
				break;
				}
			}
			System.out.println("�������û�������");
			int c=input.nextInt();
			if(c<10){
			System.out.println("Сƨ����ʲô��Ϸ");
			System.exit(-1);
			}
			System.out.println("�������û��Ļ���");
			int d=input.nextInt();
			System.out.println("���ǵ�"+i+"λ�û�����Ϣ:   "+"���:  "+b+"   ����:  "+c+"����:  "+d);
			
		}
	}
}