package ×÷Òµ;

class T {
	public void a() {
		System.out.println("1");
		System.out.println("2");
	}
}
class T1 extends T {
	public void a() {
		System.out.println("3");
		super.a();
	}
	public void b() {
		System.out.println("0");
	}
}
class Zy6 {
	public static void main(String[] args) {
//		T z=new T1();										
//		z.b();					
//		z.a();	
		//¸Ä
		T z=new T1();						
		T1 y=(T1)z;				
		y.b();	
		z.a();
	}
}