import java.util.Scanner;
import java.util.Arrays;
public class Hw05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] a={0,0,0};
		double sum=0;
		int[] b=new int[10];
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ���");
			int score=input.nextInt();
			b[i-1]=score;
			if(score<60){
				a[0]++;
			}else if(score>=60&&score<80){
				a[1]++;
			}else{
				a[2]++;
			}
			sum+=score;
			
		}
		Arrays.sort(b);
		System.out.println("60�����µ��У�"+a[0]+"����");
		System.out.println("60�ֵ�80�ֵ��У�"+a[1]+"����");
		System.out.println("80�����ϵ��У�"+a[2]+"����");
		System.out.println("���ֵΪ��"+b[9]);
		System.out.println("��СֵΪ��"+b[0]);
		System.out.println("ƽ����Ϊ��"+sum/10);
	}
}