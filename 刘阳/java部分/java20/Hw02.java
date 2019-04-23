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
			//��д����
			fw = new FileWriter(file);
			//д������
			fw.write("���ã��ҵ�������{name},����һֻ{type}���ҵ�������{master}��");
			//����
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//��������
			FileReader fr =new FileReader(file);
			//�����뻺����
			BufferedReader rr =new BufferedReader(fr);
			//һ�ζ�һ��
			String content=rr.readLine();
			//��д����
			fw =new FileWriter(file2);
			//��д�뻺����
			BufferedWriter wr =new BufferedWriter(fw);
			content=content.replace("{name}", "ŷŷ");
			content=content.replace("{type}", "����");
			content=content.replace("{master}", "��ΰ");
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