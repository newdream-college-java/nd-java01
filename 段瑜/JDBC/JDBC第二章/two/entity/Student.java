package cn.two.entity;

public class Student {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
