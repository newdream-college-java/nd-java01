import java.util.Scanner;
public class A05{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("������10��ѧ���ĳɼ�");
		//int arr[]={11};
		//double[]arr=new double[b];//�������飬��ѧ���ĳɼ�
		int zf=0;
		//double a=0;
		int[]ar=new int[10];
		int m=0,k=0,l=0;
		for(int i=1;i<11;i++){
			System.out.println("�������"+i+"ѧ����chengji");
			 ar[i]=input.nextInt();//����ɼ�
			
			zf+=ar[i];  //�ۼ��ܷ�
			if(ar[i]<60){
				m++;
				System.out.println("С��60����"+m);
			}else if(ar[i]>=60&&ar[i]<80){
				k++;
				System.out.println("����60С��80����"+k);
			}else if(ar[i]>=80){
				l++;
				System.out.println("����80�ֵ���"+l);
			}
			
		}
		System.out.println("�ܷ�"+zf);
		int avg=zf/10;
		System.out.println("ƽ����"+avg);
		int max =0;// ������ʼ��
		int min =100;
		for(int i=0;i<11;i++){
			if(ar[i]>max){
				max=ar[i];
			}
			/*if(ar[i]<min){
				min=ar[i];
			}*/
		}
		for(int i=1;i<11;i++){
			if(ar[i]<min){
				min=ar[i];
			}
		}
		
		System.out.println("��߷֣�"+max);
		System.out.println("��ͷ֣�"+min);

	}	
}