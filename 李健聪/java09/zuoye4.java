import java.util.Scanner;


public class zuoye4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int df=0,zf=0,gf=0,sum=0;
		double avg=0;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"��ͬѧ�ĳɼ�");
			int a=input.nextInt();
			if(a<60){
				df++;
				sum+=a;
			}else if(a>=60&&a<80){
				zf++;
				sum+=a;
			}else{
				gf++;
				sum+=a;
				
			}
		}System.out.println("60�����µ���"+df+"��    60~80�ֵ���"+zf+"��    80�����ϵ���"+gf+"��");
		System.out.println("�ܷ�Ϊ"+sum);
		avg=sum*1.0/10;
		System.out.println("ƽ����Ϊ"+avg);
	}

}
