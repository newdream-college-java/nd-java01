
public class Person {
	private String name="����";
	private int age;
	private String sex;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(1<=age&&age<=100){
			this.age = age;
		}else{
			try {
				throw new Exception("���������1��100֮�䣡");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	}
	public void setSex(String sex) {
		if(sex.equals("��")||sex.equals("Ů")){
			this.sex = sex;
		}else{
			try {
				throw new Exception("�Ա�������л���Ů��");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	public void print(){
		System.out.println(name+"("+sex+","+age+"��)");
	}
}
