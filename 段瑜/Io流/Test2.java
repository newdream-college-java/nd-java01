package ×÷Òµ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader	fk=new BufferedReader(new FileReader("D:/xuexi/Í¼Æ¬/pet.template"));
		FileWriter fw = new FileWriter("pet.txt");		
		String con=fk.readLine();
		while(con!=null){
			
			con=con.replace("{name}","Å·Å·");
			con=con.replace("{type}","¹·¹·");
			con=con.replace("{master}","ÀîÎ°");
			System.out.println(con);
			fw.write(con);
			con=fk.readLine();
			
		}
		
		fw.close();
		fk.close();
		
		
	}
}
