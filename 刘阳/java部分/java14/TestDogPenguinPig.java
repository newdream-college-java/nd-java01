import java.util.Scanner;


public class TestDogPenguinPig {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		System.out.println("请输入要领养宠物的名字：");
		String name=input.next();
		System.out.println("请输入要领养的宠物类型：（1、狗狗  2、企鹅  3、猪）");
		int type=input.nextInt();
		switch(type){
			case 1:
				Dog02 dog=new Dog02(name,100,80);
				dog.choicestrain();
				dog.show();
				break;
			case 2:
				Penguin02 Penguin=new Penguin02(name,100,80);
				Penguin.choicestrain();
				Penguin.show();
				break;
			case 3:
				Pig pig=new Pig(name,100,80);
				pig.choicestrain();
				pig.show();
				break;
		}
	}

}
