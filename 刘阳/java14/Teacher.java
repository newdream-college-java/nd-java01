
public class Teacher {
	String name;
	char sex;
	int age;
	//���ü����������td( Technical Direction)
	String td;
	//����רҵ�ı���zy
	String zy;
	static final String Java="java����";
	static final String cs="����";
	static final String android="ANDROID";
	public Teacher(String td,String name,int age){
		sex='��';
		zy="�������";
		this.td=td;
		this.name=name;
		this.age=age;
	}
	public Teacher(int age,String zy,String name,char sex,String td){
		this.age=age;
		this.zy=zy;
		this.name=name;
		this.sex=sex;
		this.td=td;
	}
	public void show(){
		System.out.println("�ҵ����ֽ�"+name+"���Ա���:"+sex+"��������:"+age+"��רҵ��:"+zy+"����������Ϊ:"+td);
	}
	
}

