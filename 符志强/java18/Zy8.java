package 作业;

public class Zy8 {
	public static void foo(int i) {
		try {
			if (i==1) {//范围错误应该  i<1
				throw new Exception();
			}
			System.out.print("1");//或者把输出发到if前面
		} catch (Exception e) {
			System.out.print("2");
		}finally{
			System.out.print("3");
		}
		System.out.print("4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo(1);
	}

}
