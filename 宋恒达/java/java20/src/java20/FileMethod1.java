package java20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �����ֽ��������ļ����ļ����ҵ��ഺ������.txt��λ��D�̸�Ŀ¼��
 * Ҫ�󽫴��ļ������ݸ��Ƶ�C:\myFile\myPrime.txt��
 * ���ݽ�Ա�ṩ�ġ���ϰ�زġ��ġ��ҵ��ഺ������.txt���������
 * @author mo
 *
 */
public class FileMethod1 {
	public static void main(String[] args) {
		//������copy���ļ�����
		File copyFile=new File("D:\\�ҵ��ഺ������.txt");
		//�жϱ�copy���ļ��治����
		if(!copyFile.exists()) {
			try {
				//�����ھʹ����ļ�
				copyFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//�����ļ�������
		FileWriter fwCopy=null;
		//��������������
		BufferedWriter bwCopy=null;
		try {
			fwCopy = new FileWriter(copyFile);
			bwCopy=new BufferedWriter(fwCopy);
			//д���ļ�
			bwCopy.write("�ҵ��ഺ��������������");
			bwCopy.close();
			fwCopy.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file=new File("C:\\myFile\\myPrime.txt");
		if(!file.exists()) {
			if(file.getParentFile()!=null) {
				file.getParentFile().mkdir();
			}
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fr=new FileReader(copyFile);
			br=new BufferedReader(fr);
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			String content=null;
			while((content=br.readLine())!=null) {
				bw.write(content);
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
			System.out.println("������ɣ���鿴�ļ�����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
