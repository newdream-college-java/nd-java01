import java.util.Scanner;
public class java10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n\n");
		int num;
		String birthday;
		int score;
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա��(<4λ����>):");
			if(input.hasNextInt()==true){
				num=input.nextInt();
			}else{
				System.out.println("¼��ʧ��");
				break;
			}
			System.out.print("�������Ա����(��/��<����λ����ʾ>):");
			if(input.hasNext()==true){
				birthday=input.next();
			}else{
				System.out.println("¼��ʧ��");
				break;
			}
			System.out.print("�������Ա����");
			if(input.hasNextInt()==true){
				score=input.nextInt();
			}else{
				System.out.println("¼��ʧ��");
				break;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�"+num+"\t"+birthday+"\t"+score);
		}
	}
}