package com.wangxin.test20z;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class petChange1_2 {
	public static void main(String[] args) throws IOException {
		FileReader fileRead = new FileReader("F:\\b.txt");
		FileWriter fileWrite = new FileWriter("F:\\b.txt");
		BufferedReader br = new BufferedReader(fileRead);
		String con = br.readLine();
		while (con!=null) {
			con = con.replaceAll("\\{name\\}", "≈∑≈∑");
			con = con.replaceAll("\\type\\}", "π∑π∑");
			con = con.replaceAll("\\{master\\}", "¿ÓŒ∞");
			fileWrite.write(con);
			System.out.println(con);
			System.out.println(1);
		}
		br.close();
		fileWrite.close();
		fileRead.close();
	}
}
