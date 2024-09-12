package com.java.java19;
public class Penguin  {
	private String bh;	
	private String name;
	private String sex;
	public Penguin(){
	}
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
		
	}
	
	

	public int hashCode() {		
		return 100;                                   
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Penguin){
			Penguin pg=(Penguin) obj;
			if(pg.name.equals(this.name)&&pg.sex.equals(this.sex)){
				return true;
			}else{
				return false;
			}
		}else{
			return true;
		}
	
		
	}
	
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	@Override
	public String toString() {
		return name + "\t" + sex;
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


}
