/*����10��ѧ���ĵ��Ƴɼ���������ɼ���60�����£���������60-80�֣���60����80����80�����ϵ�ѧ�����ж��ٸ����������߷֡���ͷֺ�ƽ����*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=10;
		double sum=0;
		int b=0,c=0,d=0;
		double[] arr=new double[a];
		for(int i=0;i<arr.length;i++){
			System.out.print("��"+(i+1)+"��ѧ���ĳɼ���");
			arr[i]=input.nextDouble();
			sum+=arr[i];
			if(arr[i]<60){
				b++;
			}else if(arr[i]>=60&&arr[i]<80){
				c++;
			}else{
				d++;
			}
		}
		double max=0,min=0;
		max=arr[0];
		min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.print("�ɼ���60�����µģ�"+b+"��\n�ɼ���80��60�֣�����60�֣���"+c+"��\n�ɼ���80�����ϵģ�����80�֣���"+d+"��\n");
		System.out.println("�ɼ����ֵΪ��"+max+"�ɼ���СֵΪ��"+min+"ƽ��ֵΪ��"+sum/arr.length);
	}
}