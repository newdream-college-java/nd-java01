package com.cc.enity;

public class PetTypeInfo {
	private int id;
	private String typeName;
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
		return "PetTypeInfo [id=" + id + ", typeName=" + typeName + "]";
	}
	public PetTypeInfo(int id, String typeName) {
		super();
		this.id = id;
		this.typeName = typeName;
	}
	public PetTypeInfo(){
		
	}
}
