package hwPrinter;

public class TestPrinter {

	public static void main(String[] args) {
		Printer pri=new DotMatrixPrinter();
		pri.print();
		pri=new InkperPrinter();
		pri.print();
		pri=new LaserPrinter();
		pri.print();
	}

}
