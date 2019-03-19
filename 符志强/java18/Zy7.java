package 作业;

public class Zy7 {
	public void test() {
		try {
			System.out.println("try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 1");
//		}catch (Exception e) {
//			System.out.println("catch 2");
//		}catch (NullPointerException e) {
//			System.out.println("catch 3");
//		}
			//Exception 放在前面的话 后面的不会执行
		}catch (NullPointerException e) {
			System.out.println("catch 2");
		}catch (Exception e) {
			System.out.println("catch 3");
		}
	}

}
