import java.util.Scanner;
public class Java1_5{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		double []score = new double[10];
		double max=score[0];
		double min=score[0];
		for(int i=0;i<10;i++){
			System.out.println("�������"+i+"��ѧ���ĳɼ�");
			score[i]=input.nextDouble();
			if(score[i]>max){
				max=score[i];
			}else{
				min=score[i];
			}

		}
		System.out.println("��߳ɼ�Ϊ��"+max+"\t��ͳɼ�Ϊ��"+min);
	}
}