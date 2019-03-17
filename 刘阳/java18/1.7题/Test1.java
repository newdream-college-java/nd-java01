
public class Test1 {
	public void test(){
		try{
			System.out.println("try");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch 1");
		}catch(NullPointerException e){
			System.out.println("catch 3");
		}catch(Exception e){
			System.out.println("catch 2");
		}
		//在多重的catch结构里面，要把Exception的异常类型放在最后面才行，否则之后的不会被执行
//		}catch(NullPointerException e){
//			System.out.println("catch 3");
//		}
	}
}
