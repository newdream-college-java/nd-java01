package 第20章集合作业_泛型;

public class Penguin {
	private String name;
	private String sex;
	private int no;
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String toString(){
		return this.name+"\t"+this.sex;
	}
	
}
