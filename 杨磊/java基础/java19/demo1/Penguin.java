package com.nd.yl.demo1;

public class Penguin {

	private String name;
	private String sex;
	private int id;

	public Penguin() {

	}

	public Penguin(String name, String sex) {
		this.name = name;
		this.sex = sex;

	}

	public Penguin(int id, String name, String sex) {
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.name + "\t" + this.sex;

	}

	@Override
	public int hashCode() {

		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Penguin) {
			Penguin i = (Penguin) obj;
			if (i.name.equals(this.name) && i.sex == this.sex) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
