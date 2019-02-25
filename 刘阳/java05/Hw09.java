import java.util.Scanner;
public class Hw09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("****************************************"+"\n"+"ÇëÑ¡Ôñ¹ºÂòµÄÉÌÆ·±àºÅ£º"+"\n"+"1.TĞô    2.ÍøÇòĞ¬   3.ÍøÇòÅÄ"+"\n"+"****************************************");
		//Ñ­»·ÊäÈëÉÌÆ·±àºÅ
		System.out.println("ÇëÊäÈëÉÌÆ·±àºÅ");
		int num=input.nextInt();
		int sl;
		double sum=0,sf,a=0,b=0,c=0;
		while(num>0&&num<4){
			if(num==1){
				System.out.println("ÇëÊäÈë¹ºÂòÊıÁ¿");
				sl=input.nextInt();
				a=sl+a;
				sum=sl*245+sum;
				System.out.println("TĞô"+"\t"+"£¤245.0"+"\t"+"ÊıÁ¿"+a+"\t"+"ºÏ¼Æ£¤"+sum);
				System.out.println("ÊÇ·ñ¼ÌĞø£¨y/n£©");
				String ans=input.next();
				if(ans.equals("n")){
					System.out.println("ÇëÊäÈëÊµ¸¶½ğ¶î£º");
					sf=input.nextDouble();
					System.out.println("ÕÛ¿Û£º0.8"+"\n"+"Ó¦¸¶½ğ¶î£º"+sum*0.8+"\n"+"Êµ¸¶½ğ¶î£º"+sf+"\n"+"ÕÒÇ®£º"+(sf-sum*0.8));
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("ÇëÊäÈëÉÌÆ·±àºÅ");
					num=input.nextInt();
				}
			}else if(num==2){
				System.out.println("ÇëÊäÈë¹ºÂòÊıÁ¿");
				sl=input.nextInt();
				b+=sl+b;
				sum=sl*345+sum;
				System.out.println("ÍøÇòĞ¬"+"\t"+"£¤345.0"+"\t"+"ÊıÁ¿"+b+"\t"+"ºÏ¼Æ£¤"+sum);
				System.out.print("ÊÇ·ñ¼ÌĞø£¨y/n£©");
				String ans=input.next();
				if(ans.equals("n")){
					System.out.println("ÇëÊäÈëÊµ¸¶½ğ¶î£º");
					sf=input.nextDouble();
					System.out.println("ÕÛ¿Û£º0.8"+"\n"+"Ó¦¸¶½ğ¶î£º"+sum*0.8+"\n"+"Êµ¸¶½ğ¶î£º"+sf+"\n"+"ÕÒÇ®£º"+(sf-sum*0.8));
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("ÇëÊäÈëÉÌÆ·±àºÅ");
					num=input.nextInt();
				}
			}else if(num==3){
				System.out.println("ÇëÊäÈë¹ºÂòÊıÁ¿");
				sl=input.nextInt();
				c=sl+c;
				sum=sl*45+sum;
				System.out.println("ÍøÇò"+"\t"+"£¤45.0"+"\t"+"ÊıÁ¿"+c+"\t"+"ºÏ¼Æ£¤"+sum);
				System.out.print("ÊÇ·ñ¼ÌĞø£¨y/n£©");
				String ans=input.next();
				if(ans.equals("n")){
					System.out.println("ÇëÊäÈëÊµ¸¶½ğ¶î£º");
					sf=input.nextDouble();
					System.out.println("ÕÛ¿Û£º0.8"+"\n"+"Ó¦¸¶½ğ¶î£º"+sum*0.8+"\n"+"Êµ¸¶½ğ¶î£º"+sf+"\n"+"ÕÒÇ®£º"+(sf-sum*0.8));
					System.exit(-1);
				}else if(ans.equals("y")){
					System.out.print("ÇëÊäÈëÉÌÆ·±àºÅ");
					num=input.nextInt();
				}
			}
		}	
	}
}