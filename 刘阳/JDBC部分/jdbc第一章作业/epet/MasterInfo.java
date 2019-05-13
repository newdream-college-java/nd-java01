package epet;

import java.util.Date;

public class MasterInfo {
	 private int id;
	 private String name;
	 private String password;
	 private int money;
	 //构造方法
	 public MasterInfo() {
	    }

	    public MasterInfo(String name,String password,int money) {
	        super();
	        this.name = name;
	        this.password=password;
	        this.money = money;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	Test ts=new Test();
	public String toString() {
        return "MasterInfo [id=" + id + ", name=" + name + ",password=" + password + ", money=" + money + "]\n";
    }
}
