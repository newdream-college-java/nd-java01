package zuoye;

public class Zylei8 {
	int a;
	int b;
	int c;
	public void sjx(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		boolean f=false;
		while (!f) {
			if ((a*a+b*b)==c*c||(a*a+c*c)==b*b||(c*c+b*b)==a*a) {
				System.out.println("��ֱ��������");
				f=true;
			}else 
			if ((a*a+b*b)<c*c||(a*a+c*c)<b*b||(c*c+b*b)<a*a) {
				System.out.println("�Ƕٽ�������");
				f=true;
			}else
			if ((a*a+b*b)>c*c||(a*a+c*c)>b*b||(c*c+b*b)>a*a) {
				System.out.println("�����������");
				f=true;
			}else if((a+b)>c&&(b+c)>a&&(a+c)>b) {
				System.out.println("Ϊ������");
				f=true;
			}else{
				System.out.println("����������");
				f=true;
			}
		}
	}
}
