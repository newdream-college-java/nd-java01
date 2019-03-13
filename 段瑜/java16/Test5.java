package ÈËÓë³èÎï;

public class Test5 {
	public static void main(String[] args){
		Printer print=new DotMateixPrinter();
		print.Print();
		print=new InkperPrinter();
		print.Print();
		print=new LaserPrinter();
		print.Print();
	}
}
