package ื๗าต;

public class Test7 {
	public void test(){
		try{
			System.out.println("try");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch 1");
		}catch(NullPointerException e){
			System.out.println("catch 3");
		}catch (Exception e) {
			System.out.println("catch 2");
			// TODO: handle exception
		}
	}
}
