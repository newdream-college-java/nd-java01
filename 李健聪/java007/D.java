import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int jzs=0,jfs=0,jl=0;	
		System.out.println("������һ����");
		
			for(int i=0;;i++){
				
				int a=input.nextInt();
				if(a==999){
					System.out.println("������"+jzs+"��\t������"+jfs+"��\t0��"+jl+"��");
					System.exit(-1);	
				}
				if(a>0){
					jzs++;
					System.out.println("����������һ����");
				}if(a==0){
					jl++;
					System.out.println("����������һ����");
				}if(a<0){
					jfs++;
					System.out.println("����������һ����");
				}
			}
		
	}
}