
public class Penguin {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public Penguin(String name, String sex) {
		this.name=name;
		this.sex=sex;
	}
	public String toString(){
		return name+"\t"+sex;	
	}
	public int hashcode(){
		return 1;
	}
	public boolean equals(Object obj){
		if(obj==this){
			return true;
		}
		if(obj instanceof Penguin){
			Penguin pen=(Penguin)obj;
			if(pen.name.equals(this.name)&&pen.sex.equals(this.sex)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
