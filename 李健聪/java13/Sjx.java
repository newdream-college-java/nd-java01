package 第十三章作业;

public class Sjx {
	public Sjx(int a,int b,int c){
		if(a+b>c&&a+c>b&&b+c>a){
			if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
				System.out.println("这是个直角三角形");
				System.exit(-1);
			}
			if(a*a>b*b+c*c||b*b>a*a+c*c||c*c>a*a+b*b){
				System.out.println("这是个钝角三角形");
				System.exit(-1);
			}else{
				System.out.println("这是个锐角三角形");
				System.exit(-1);
			}
		}else{
			System.out.println("这不是个三角形");
			System.exit(-1);
		}
		
			
		
	}
}
