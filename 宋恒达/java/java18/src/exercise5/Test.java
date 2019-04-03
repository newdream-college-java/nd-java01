package exercise5;
/**
 * 编写能产生ArrayIndexOutOfBoundException异常的代码
 * 并将其捕获，在控制台上输出异常信息
 * 使用log4j记录日志到控制台和文件
 */
import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Test.class);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=1;
		}
		try {
			for(int i=0;i<a.length+1;i++) {
				System.out.println(a[i]);
			}			
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			logger.error(e);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
