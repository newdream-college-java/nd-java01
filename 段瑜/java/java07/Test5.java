import java.util.Scanner;
public class Test5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=input.nextInt();
		int a=0,b=0,c=0;
		for(int i=1;i!=0;i++){
			if(sum>0){
				a+=1;
				if(sum==999){
					break;
				}
			}else if(sum==0){
				b+=1;
			}else{
				c+=1;
			}
			sum=input.nextInt();
		}
		System.out.println("�����ĸ���Ϊ��"+a+"\n�����ĸ���Ϊ��"+c+"\n0�ĸ���Ϊ��"+b);
	}
}