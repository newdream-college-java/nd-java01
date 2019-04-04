package com.java.java23;
import java.io.File;
import java.io.IOException;
/**
 *  File����ʾ����
 */
public class Test01 {
	/**
	 * �����ļ��ķ���
	 * @param file �ļ�����
	 */
	
	public void create(File file){
		//�ж��ļ��Ƿ����,�������򴴽�������ʾ������Ϣ
		
		if(!file.exists()){
			try {
				file.createNewFile();
				System.out.println("�����ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * ɾ���ļ�
	 * @param file �ļ�����
	 */
	public void delete(File file){
		//�ж��ļ��Ƿ����,������ɾ������ʾɾ����Ϣ
		//����ļ������ڣ���ʾ"�ļ�·�����ļ�������û���ҵ����ļ���Ϣ!"
		if(file.exists()){
				file.delete();
				System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("�ļ�·�����ļ�������û���ҵ����ļ���Ϣ!");
		}
	}

	/**
	 * ��ʾ�ļ���Ϣ
	 * @param file �ļ�����
	 */
	public void showFileInfo(File file){
		//�ж��ļ��Ƿ����
		//������ļ�:��ʾ���ơ����|����·�����ļ��ֽڴ�С
		//�����Ŀ¼����ʾ"����һ��Ŀ¼!"
		//����ļ������ڣ���ʾ"�ļ�·�����ļ�������û���ҵ����ļ���Ϣ!"
		if(file.exists()){
			if(file.isDirectory()){
				System.out.println("���һ��Ŀ¼");		
			}else{
				System.out.println("�ļ�����"+file.getName());
				System.out.println("���·����"+file.getPath());
				System.out.println("����·����"+file.getAbsolutePath());
				System.out.println("�ļ���С��"+file.length()+"�ֽ�");
			}
		}else{
			System.out.println("�ļ�·�����ļ�������û���ҵ����ļ���Ϣ!");
		}
	}

	/**
	 * ���
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File("test.txt");
		Test01 fm=new Test01();
		fm.create(file);
		fm.showFileInfo(file);
		fm.delete(file);
	}

}
