import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class hw04 {
	public static void main(String[] args) {
		FileOutputStream file=null;
		OutputStreamWriter output = null;
		FileInputStream fi= null;
		InputStreamReader fs=null;
		BufferedReader br=null;
		try {
			file = new FileOutputStream("D:/test.txt",true);
			output=new OutputStreamWriter(file);
			output.write("Hello  World");
			fi=new FileInputStream("D:/test.txt");
			fs=new InputStreamReader(fi);
			br=new BufferedReader(fs);
			String con=br.readLine();
			while(con!=null){
			    System.out.println(con);
				con=br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				output.close();
				fs.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
