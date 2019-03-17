package Test2019_3_14_z17;

public class Store_1_6 {
	private static String name;
	private Pig_1_7 pig = new Pig_1_7();

	public static String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println(name);
	}

	public Pig_1_7 getPig() {
		return pig;
	}

	public void setPig(Pig_1_7 pig) {
		this.pig = pig;
	}
	
	
}
