import java.util.Scanner;
public class Hw08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ���ɼ���");
		//ѭ������ѧ���ɼ�
		double score=input.nextDouble();
		int i=1,rs=0;//����ͳ�������ı���rs
		for(;i<5;i++){
			System.out.print("����ѧ���ɼ�");
			//ѭ������ѧ���ɼ�
			score=input.nextDouble();
			if(score>80){
				rs++;
			}else{
				continue;
				}
		}	
		System.out.print("��"+rs+"�˳ɼ�����80�֡�");
	}
}