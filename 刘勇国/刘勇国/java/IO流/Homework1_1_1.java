package ��21��IO����ҵ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework1_1_1 {
	public static void main(String[] args) {
		File file1=new File("D:�ҵ��ഺ˭����.txt");
		if(!file1.exists()){
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw =new FileWriter(file1,true);
			fw.write("�ҵ��ഺ������\r\n");
			fw.write("�ҵ��ഺ������\r\n");
			fw.write("�ҵ��ഺ������\r\n");
			fw.write("�ҵ��ഺ������\r\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file2 =new File("c:/myFile");
		if(!file2.exists()){
			file2.mkdir();
			System.out.println("����myFile�ļ��гɹ�");
		}
		File file3=new File("c:/myFile/myPrime.txt");
		if(!file3.exists()){
			try {
				//�����������ļ��ɹ�
				file3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//����d��Դ�ļ�
		try {
			//��������
			FileReader fr =new FileReader(file1);
			//���ֽڶ���
			int num=fr.read();
			//��д����
			FileWriter fw=new FileWriter(file3);
			while(num!=-1){
				fw.write((char)num);
				num=fr.read();
			}
			fw.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
