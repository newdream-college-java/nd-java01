//����3����
import java.util.Scanner;
public class Demo{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a =input.nextInt();
		int sum =1;
		if(a>=1&&a<=10){
			for(int i=1;i<=a;i++){
				//int sum = 1;//����һ�������洢�ײ��ֵ
		
				for(int j=1;j<=i;j++){//ʵ�ֽײ��ѭ��

					sum *= j;
				
				}	if(i!=1&&i>=11){
						System.out.println("�������");
					}
			
						System.out.println(i+"�Ľײ��ǣ�"+sum);
			}
						//System.out.println(i+"�Ľײ��ǣ�"+sum);
		}

	


	}




}	