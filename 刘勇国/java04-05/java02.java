import java.util.Scanner;
public class java02{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("���������������");
	int peachs=input.nextInt();
	if(peachs<3){
		System.out.println("������"+peachs+"����");
	}else if(peachs>=3&&peachs<=5){
		System.out.println("������"+(peachs+1)+"����");
	}else if(peachs>5){
		System.out.println("������"+(peachs+2)+"����");
	}
	}
}