import java.util.Random;
import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("��ӭ������ȭ��Ϸ,���ȭ��0����ʯͷ��1���������2������");
		int a=input.nextInt();
		int b=rd.nextInt(3);
		while(b<3){
			
			if(a==0&&b==1){
				System.out.println("���Գ�����"+b+"��ϲ��Ӯ�ˣ���������");
				break;
			}if(a==1&&b==2){
				System.out.println("���Գ�����"+b+"��ϲ��Ӯ�ˣ���������");
				break;
			}if(a==2&&b==0){
				System.out.println("���Գ�����"+b+"��ϲ��Ӯ�ˣ���������");
				break;
			}else if(a==0&&b==2){
				System.out.println("���Գ�����"+b+"���ź�������");
				break;
			}else if(a==1&&b==0){
				System.out.println("���Գ�����"+b+"���ź�������");
				break;
			}else if(a==2&&b==1){
				System.out.println("���Գ�����"+b+"���ź�������");
				break;
			}else{
				System.out.println("˫����ƽ");
				break;
			}
			
		}a=input.nextInt();
		
	}
} 