package com.java.java23;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Test04 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("pet.template");
		FileWriter fw=new FileWriter("pet.txt");
		BufferedReader fd=new BufferedReader(fr);
		String con=fd.readLine();
		
		while(con!=null){
			con=con.replaceAll("\\{name\\}", "≈∑≈∑");
			con=con.replaceAll("\\{type\\}", "π∑π∑");
			con=con.replaceAll("\\{master\\}", "¿ÓŒ∞");
			fw.write(con);
			con=fd.readLine();
		}
		fr.close();
		fw.close();
		fd.close();
	}

	
}
