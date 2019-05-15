package entity;

public class Type {
	private int id;
	private String typeName;
	public Type() {
		
	}
	public Type(int id,String typeName) {
		super();
		this.id=id;
		this.typeName=typeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", typeName=" + typeName + "]";
	}
	
	
}
