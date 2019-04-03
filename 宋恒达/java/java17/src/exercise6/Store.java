package exercise6;

public class Store {

	public static Animal getPet(String brand) {
		Animal animal=null;
		if(brand.equals("¹·")) {
			animal=new Dog();
		}else if(brand.equals("Ã¨")) {
			animal=new Cat();
		}else if(brand.equals("pig")) {
			animal=new Pig();
		}
		return animal;
	}
}
