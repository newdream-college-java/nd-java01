package ��ҵ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader	fk=new BufferedReader(new FileReader("D:/xuexi/ͼƬ/pet.template"));
		FileWriter fw = new FileWriter("pet.txt");		
		String con=fk.readLine();
		while(con!=null){
			
			con=con.replace("{name}","ŷŷ");
			con=con.replace("{type}","����");
			con=con.replace("{master}","��ΰ");
			System.out.println(con);
			fw.write(con);
			con=fk.readLine();
			
		}
		
		fw.close();
		fk.close();
		
		
	}
}
