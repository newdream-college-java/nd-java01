
public class Engineer implements Speak,Write {

	@Override
	public void write() {
		System.out.println("我会写代码。");
		
	}

	@Override
	public void speak() {
		System.out.println("我会讲业务。");
		
	}

}
