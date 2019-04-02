package java20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 读取模板文件D:\pet.template的内容
 * 按照pet.template的模板格式保存宠物数据到
 * 文本文件，即把{name}、{type}、{master}替换为
 * 具体的宠物信息，将替换后的内容写入C:\myFile\pet.txt
 * 中，根据教员提供的“JavaOOP”第10章上机课_素材的
 * pet.template文件完成
 * @author mo
 *
 */
public class FileMethod2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		//创建File对象
		File file=new File("D:\\pet.template");
		if(!file.exists()) {   //判断文件是否存在
			try {
				file.createNewFile();	//不存在则创建新文件
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileWriter petFw=null;	//字符输入流
		BufferedWriter petBw=null;	//缓存输入流
		try {
			petFw=new FileWriter(file);
			petBw=new BufferedWriter(petFw);
			petBw.write("您好！我的名字是{name}，我是一只{type}。我的主人是{master}");
			petBw.close();
			petFw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader petFr=null;	//字符输出流
		BufferedReader petBr=null;	//缓存输出流
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
		System.out.println("替换前:"+info);
		//替换到模板中的部分
		info=info.replace("{name}", "欧欧");
		info=info.replace("{type}", "狗狗");
		info=info.replace("{master}", "李伟");
		System.out.println("替换后:"+info);
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
		//将替换掉的信息写入新文件
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
