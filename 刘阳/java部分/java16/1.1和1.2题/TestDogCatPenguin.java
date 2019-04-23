package hwDogCat;

public class TestDogCatPenguin {
//	public void feed(Pet pet){
//		pet.eat();
//	}
	public static void main(String[] args) {
		Pet pet=new Dog();
		pet.eat();
		pet.play();
		pet=new Penguin();
		pet.eat();
		pet.play();
		pet=new Cat();
		pet.eat();
		pet.play();
	}

}
