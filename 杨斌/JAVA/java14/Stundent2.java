public class Stundent2 {
	private String name;
	private int age;
	private char old;
	private String zy;
	public Stundent2(String name,int age){
		setOld('��');
		setZy("�������");
		setName(name);
		setAge(age);
	}
	public Stundent2(String name,int age,char old,String zy){
		setName(name);
		setAge(age);
		setOld(old);
		setZy(zy);
	}
	public void show(){
		System.out.println("�ҵ����ֽ�"+name+"�ҵ�������"+age+"�ҵ��Ա���"+old+"�ҵ�רҵ��"+zy);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		
		return age;
	}
	public char getOld() {
		return old;
	}
	public void setOld(char old) {
		this.old = old;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public void setAge(int age) {
			this.age =age;
			
	}
		
	
	
}
