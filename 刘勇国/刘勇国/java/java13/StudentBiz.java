package ��13����ҵ;

import java.util.Scanner;

public class StudentBiz {
	Scanner input =new Scanner(System.in);
	Student[] stus = new Student[5];
	public void addStudent(Student stu){
	 //����û��	boolean flag=true;
		for(int i=0;i<stus.length;i++){
			if(stus[i]==null){
				stus[i]=stu;
				break;
			}
			//������������
			if(i==stus.length-1){
				//���������
				break;
			}
		}
	}
	public void showStudent(){
		System.out.println("************************\n\n\t�ͻ������б�");
		System.out.println("************************");
		for(int i=0;i<stus.length;i++){
			if(stus[i]!=null){
				//�����ʱ����ֱ�������������stus[i],Ҫ����������������
				System.out.print(stus[i].name+"\t");
			}
		}
	
	}
	public void xiugai(){
		System.out.print("\n������Ҫ�޸Ŀͻ���������");
		String name =input.next();
		for(int i=0;i<stus.length;i++){
			if(name.equals(stus[i].name)){
				System.out.print("�������µĿͻ�����");
				stus[i].name=input.next();
				System.out.println("\n**********�޸Ľ��***************");
				System.out.println("\t�ҵ����ɹ���");
				showStudent();
				break;
			}else{
				System.out.println("\n**********�޸Ľ��**********");
				System.out.print("û���ҵ����޸�ʧ��");
			}
		}
	}
}
