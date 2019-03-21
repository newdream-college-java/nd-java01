package exercise1;

public class Penguin {
	private String name;
	private String sex;
	public Penguin(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void print() {
		System.out.println(name+"\t\t"+sex);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==this) {
			return true;
		}
		if(((Penguin)obj).getName()==this.getName()&&((Penguin)obj).getSex()==this.getSex()) {
			return true;
		}
		return false;
	}
}
