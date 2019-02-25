import java.util.Scanner;
public class zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping¹ÜÀíÏµÍ³>¹ºÎï½áËã");
		System.out.println("************************************");
		System.out.println("ÇëÑ¡Ïî¹ºÂòµÄÉÌÆ·±àºÅ£º"+"\n1.TÐô"+"\t2.ÍøÇòÐ¬"+"\t3.ÍøÇòÅÄ");
		System.out.println("************************************");
		System.out.print("ÇëÊäÈëÉÌÆ·±àºÅ£º");
		int bh=input.nextInt();	
		while(bh>=1&&bh<=3){
			if(bh==1){
				System.out.println("TÐô\t"+"£¤245.0");
				System.out.print("ÊÇ·ñ¼ÌÐø£¨y/n£©");
				String yn=input.next();
				if(yn.equals("n")){
					break;
				}
			}
			if(bh==2){
				System.out.println("ÍøÇòÐ¬\t"+"£¤570.0");
				System.out.print("ÊÇ·ñ¼ÌÐø£¨y/n£©");
				String yn=input.next();
				if(yn.equals("n")){
					break;
				}
			}
			if(bh==3){
				System.out.println("ÍøÇòÅÄ\t"+"£¤320.0");
				System.out.print("ÊÇ·ñ¼ÌÐø£¨y/n£©");
				String yn=input.next();
				if(yn.equals("n")){
					break;
				}
			}
		}
	}
}