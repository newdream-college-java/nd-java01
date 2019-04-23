import java.util.Scanner;
public class Hw08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("****************************************"+"\n"+"ÇëÑ¡Ôñ¹ºÂòµÄÉÌÆ·±àºÅ£º"+"\n"+"1.TĞô    2.ÍøÇòĞ¬   3.ÍøÇòÅÄ"+"\n"+"****************************************");
		//Ñ­»·ÊäÈëÉÌÆ·±àºÅ
		System.out.println("ÇëÊäÈëÉÌÆ·±àºÅ");
		int num=input.nextInt();
		while(num>0&&num<4){
			if(num==1){
				System.out.println("TĞô"+"\t"+"£¤245.0");
				System.out.print("ÊÇ·ñ¼ÌĞø£¨y/n£©");
				String ans=input.next();
				if(ans.equals("n")){
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("ÇëÊäÈëÉÌÆ·±àºÅ");
					num=input.nextInt();
				}
			}else if(num==2){
					System.out.println("ÍøÇòĞ¬"+"\t"+"£¤345.0");
					System.out.print("ÊÇ·ñ¼ÌĞø£¨y/n£©");
					String ans=input.next();
					if(ans.equals("n")){
						System.exit(-1);
					}else if(ans.equals("y")){
						System.out.print("ÇëÊäÈëÉÌÆ·±àºÅ");
						num=input.nextInt();
					}
			}else if(num==3){
					System.out.println("ÍøÇò"+"\t"+"£¤45.0");
					System.out.print("ÊÇ·ñ¼ÌĞø£¨y/n£©");
					String ans=input.next();
					if(ans.equals("n")){
						System.exit(-1);
					}else if(ans.equals("y")){
						System.out.print("ÇëÊäÈëÉÌÆ·±àºÅ");
						num=input.nextInt();
					}
			}
		}	
	}
}