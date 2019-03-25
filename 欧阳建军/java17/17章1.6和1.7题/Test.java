package 第17章接口宠物1_6和1_7;

public class Test {
	public static void main(String[] args) {
		Store s=new Store();
		if(s.get()==1){
			Dog dog=new Dog();
			dog.shout();
		}else{
			Cat cat =new Cat();
			cat.shout();
		}
	}
	
	
}
