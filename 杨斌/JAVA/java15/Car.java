import java.util.Scanner;
public class  Car extends MotoVehicle {
	public void show(){
		Scanner input =new Scanner(System.in);
		System.out.println("������Ҫ��ƾ������Ʒ�ƣ�1������2�����");
		int a=input.nextInt();
		if(a==1){
			setXh(500);
		}else if(a==2){
			System.out.println("������Ҫ��ƾ���ͺţ�1�������GL82��������");
			int b=input.nextInt();
			if(b==1){
				setXh(600);
			}else if(b==2){
				setXh(300);
			}else {
				System.out.println("�������");
			}
		}else {
			System.out.println("�������");
		}
		System.out.println("�������ĳ��ƺţ���BK5543");
		System.out.println("�˿����ã�����Ҫ֧���ķ�����"+getFy());
		}
}
