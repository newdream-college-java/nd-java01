package java20;

import java.io.File;
import java.io.IOException;
/**
 * ���ݽ�Ա�ṩ�ġ���ϰ�����زġ���FileMethod.java�ļ�
 * ��������Ŀ������ļ�ע�Ͳ��ֵĴ����д
 * @author mo
 *
 */
public class FileMethod {
	public static void main(String[] args) {
		//�����ļ�����
		File file=new File("D:\\text.java");
		if(!file.exists()) {	//�ж��ļ��Ƿ����
			try {
				//�����ļ�
				file.createNewFile();
				System.out.println("�ļ��Ѵ�����");
				//�õ��ļ���
				System.out.println("���ƣ�"+file.getName());
				//�õ��ļ����·��
				System.out.println("���·����"+file.getPath());
				//�õ��ļ�����·��
				System.out.println("����·����"+file.getAbsolutePath());
				//�õ��ļ���С
				System.out.println("�ļ���С��"+file.length()+"�ֽ�");
				if(file.delete()) {	//ɾ���ļ�
					System.out.println("�ļ���ɾ����");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
