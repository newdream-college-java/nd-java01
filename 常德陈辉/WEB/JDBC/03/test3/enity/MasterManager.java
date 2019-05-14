package test2.enity;

public class MasterManager {
	private int id;
	private String name;
	public MasterManager(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public MasterManager() {
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "MasterManager [id=" + id + ", name=" + name + "]";
	}
	
}
