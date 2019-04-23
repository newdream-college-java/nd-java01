import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw02 {
	public static void main(String[] args)  {
		File file2 =new File("c:/myFile/pet.txt");
		File file =new File("d:/pet.template.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileWriter fw;
		try {
			//打开写出流
			fw = new FileWriter(file);
			//写出数据
			fw.write("您好！我的名字是{name},我是一只{type}。我的主人是{master}。");
			//关流
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//开读入流
			FileReader fr =new FileReader(file);
			//开读入缓存流
			BufferedReader rr =new BufferedReader(fr);
			//一次读一行
			String content=rr.readLine();
			//开写出流
			fw =new FileWriter(file2);
			//打开写入缓存流
			BufferedWriter wr =new BufferedWriter(fw);
			content=content.replace("{name}", "欧欧");
			content=content.replace("{type}", "狗狗");
			content=content.replace("{master}", "李伟");
			while(content!=null){
				wr.write(content);
				content =rr.readLine();
			}
			wr.close();
			fw.close();
			rr.close();
			rr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}