package java20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ��ȡģ���ļ�D:\pet.template������
 * ����pet.template��ģ���ʽ����������ݵ�
 * �ı��ļ�������{name}��{type}��{master}�滻Ϊ
 * ����ĳ�����Ϣ�����滻�������д��C:\myFile\pet.txt
 * �У����ݽ�Ա�ṩ�ġ�JavaOOP����10���ϻ���_�زĵ�
 * pet.template�ļ����
 * @author mo
 *
 */
public class FileMethod2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		//����File����
		File file=new File("D:\\pet.template");
		if(!file.exists()) {   //�ж��ļ��Ƿ����
			try {
				file.createNewFile();	//�������򴴽����ļ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileWriter petFw=null;	//�ַ�������
		BufferedWriter petBw=null;	//����������
		try {
			petFw=new FileWriter(file);
			petBw=new BufferedWriter(petFw);
			petBw.write("���ã��ҵ�������{name}������һֻ{type}���ҵ�������{master}");
			petBw.close();
			petFw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader petFr=null;	//�ַ������
		BufferedReader petBr=null;	//���������
		String info="";
		try {
			petFr=new FileReader(file);
			petBr=new BufferedReader(petFr);
			String content=null;
			while((content=petBr.readLine())!=null) {
				info=info.concat(content);
			}
			petBr.close();
			petFr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�滻ǰ:"+info);
		//�滻��ģ���еĲ���
		info=info.replace("{name}", "ŷŷ");
		info=info.replace("{type}", "����");
		info=info.replace("{master}", "��ΰ");
		System.out.println("�滻��:"+info);
		File pet=new File("C:\\myFile\\pet.txt");
		if(!pet.exists()) {
			if(!pet.getParentFile().exists()) {
				pet.getParentFile().mkdir();
			}
			try {
				pet.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//���滻������Ϣд�����ļ�
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter(pet);
			bw=new BufferedWriter(fw);
			bw.write(info);
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
