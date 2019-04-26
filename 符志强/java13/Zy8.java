package zuoye;

import java.util.Scanner;

public class Zy8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] b=new int[3];
		for(int i=1;i<=3;i++){
			System.out.print("请输入三角形的第"+i+"个边的长度");
			b[i-1]=input.nextInt();
		}
		Zylei8 a=new Zylei8();
		a.sjx(b[0], b[1], b[2]);
	}

}
