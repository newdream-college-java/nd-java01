
public class Teacher {
	String name;
	char old;
	int age;
	String zy;
	String js;
	static final String java="java����";
	static final String cs="����";
	static final String android="ANDROID";
	public Teacher(String name,int age){
		this.age=age;
		this.name=name;
		old='��';
		zy="�������";
		js=java;
	}
	public Teacher(String name,char old,int age,String zy){
		this.zy=zy;
		this.name=name;
		this.age=age;
		this.old=old;
		js=cs;
	}
	public void show(){
		System.out.println("�ҵ����ֽ�:"+name+"\n�Ա���:"+old+"\n������:"+age+"\nרҵ��:"+zy+"\n��������Ϊ:"+js);
	}
	
}
