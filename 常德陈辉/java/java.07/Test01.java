/*���ʵ�ֽ����û����������������������Ľ׳ˡ����磺��������4�������4��=4*3*2*1=24.Ҫ����������1~10��������ʾ����*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("��������������");
	int a=input.nextInt();
	int i,sum=1,j=1;
	if(a>0&&a<11){
		for(i=a;;i--){
			if(i!=0){		
				System.out.print(i+"*");
			}else{
				System.out.print("\b="+sum+"\n");
				break;
			}
			sum*=i;
		}
		}else{
			System.out.print("�������");
		}
	
	}

}