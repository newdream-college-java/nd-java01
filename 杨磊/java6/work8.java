import java.util.*;
public class work8{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int j = 0;
		for(int i = 1;i<=5;i++){
			System.out.print("�����"+i+"��ͬѧ�ĳɼ���");
			int a = input.nextInt();
			if(a>80){
				j++;
			}else{
				continue;
			}
		}
		System.out.print("�����ͬѧ�ĳɼ���"+j+"������80��");
	}
}