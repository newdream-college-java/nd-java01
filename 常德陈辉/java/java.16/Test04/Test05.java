package Test04;

public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer dy=new DotMatrixPrinter();
		dy.print();
		dy=new InkperPrinter();
		dy.print();
		dy=new LaserPrinter();
		dy.print();
	}

}
