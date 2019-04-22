import org.apache.log4j.Logger;


public class Testlog {
	static Logger log=Logger.getLogger(Testlog.class);
	public static void main(String[] args) {
		try{
			int[] arr=new int[5];
			for(int i=0;i<=arr.length;i++){
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}

	}

}
