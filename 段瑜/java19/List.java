package ื๗าต;

public class List {
	private   String name;
	private  String sex;
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List(String name,String sex){
		setName(name);
		setSex(sex);
	}
	public String toString(){
		return name+"\t"+sex;
		
	}
	public int HashCode(){
		return 1;
	}
	public boolean equals(Object obj){
		if(obj==this){
			return true;
		}

		if(obj instanceof List){
			List list=(List)obj;
			if(list.name.equals(this.name)&&list.sex.equals(this.sex)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
}
