/*����һ������n,ͳ��1��n���ж��ٸ�������ż����*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������һ������");
	int n=input.nextInt();
	int j=0,o=0;
	for(int i=1;i<=n;i++){
		if(i%2==0){
			o++;
			}else{
			j++;
			}
		}
	System.out.print("������"+j+"��"+"\tż����"+o+"��");
	}

}