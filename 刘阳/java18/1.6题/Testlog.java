import org.apache.log4j.Logger;


public class Testlog {
	static Logger log=Logger.getLogger(Testlog.class);
	public static void main(String[] args) {
		try{
			int[] arr={2,4,12,8,3};
			for(int i=0;i<=arr.length;i++){
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			log.debug("数组下标异常！");
		}

	}

}
