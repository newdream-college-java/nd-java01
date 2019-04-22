package Test6;

import org.apache.log4j.Logger;

public class Test06 {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(Test06.class);
		try{
			int[] arr=new int[3];
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.debug("³ö´íÁË");
			e.printStackTrace();
		}
	}
}
