package java16;

public class Chi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotMatrixPrinter y=new DotMatrixPrinter();
		y.print("针式打印机");
		InkperPrinter k=new InkperPrinter();
		k.print("喷墨打印机");
		LaserPrinter m=new LaserPrinter();
		m.print("激光打印机");
	}

}
