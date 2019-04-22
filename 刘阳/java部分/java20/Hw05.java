import java.io.File;
import java.io.IOException;


public class Hw05 {
	public static void main(String[] args) {
		File file=new File("D:/test.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			File file2=new File("D:/copy_test.txt");
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}	
