package com.wangxin.test20z;

import java.io.*;
public class fileCopyDemo1_1{
    public static void main(String[] args)throws IOException{
        FileInputStream read = new FileInputStream(new File("F:\\a.txt"));
        FileOutputStream wr = new FileOutputStream(new File("F:\\b.txt"));
        byte[] b = new byte[1024];
        int len = 0;
        while((len=read.read(b))!=-1){
            wr.write(b,0,len);
            wr.flush();
        }
        //�����ļ�����鿴�Ƿ������
        File file = new File("F:\\b.txt");
        if (file.exists()) {
			System.out.println("������ɣ���鿴�ļ�");
		}
        wr.close();
        read.close();
    }
} 