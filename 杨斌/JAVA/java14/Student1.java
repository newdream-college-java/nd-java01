public class Student1 {

	private String name;
	private int age;
	public void show(){
		System.out.println("�ҵ����ֽ�"+name+"�ҵ�������"+age);
		
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
	public void setAge(int age) {
		if(age>15){
			this.age =age;
			System.out.println("��������ɹ�������");
		}else{
			System.out.println("�������䲻�ɹ�������Ĭ��ֵ");
			this.age=18;
			
		}

	
	}
}
