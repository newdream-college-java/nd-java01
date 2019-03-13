package Test2019_3_12_z16;

public class Test03 {
	public static void main(String[] args) {
		Printer dm = new DotMatrixPrint();
		dm.print();
		Printer ip = new InkperPrinter();
		ip.print();
		Printer lp = new LaserPrinter();
		lp.print();
	}
}
