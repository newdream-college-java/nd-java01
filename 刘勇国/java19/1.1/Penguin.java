package 第20章集合作业;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class Penguin {
	String name;
	String sex;
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;
		return this.name;
	}
	public String getSex() {
		return sex;
	}
	public String setSex(String sex) {
		this.sex = sex;
		return this.sex;
	}
	public Penguin(String name,String sex){
		this.name=setName(name);
		this.sex=setSex(sex);
	}
	public Penguin(String name){
		this.name=setName(name);
	}
	public String toString(){
		return name+"\t"+sex;
	}
	public int hasCode(){
		return 111;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj instanceof Penguin){
			Penguin p =(Penguin)obj;
			if(p.name==this.name&&p.sex==this.sex){
				return true;
			}
		}else{
			return false;
		}
		return false;
	}

	
}
