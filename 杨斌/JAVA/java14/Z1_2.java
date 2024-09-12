import java.util.Scanner;
public class Z1_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog dog=new Dog();
		Penguin pg=new Penguin();
		System.out.println("欢迎您来到宠物店");
		System.out.print("请输入要领养宠物的名字");
		String name=input.next();
		System.out.print("请选择要领养的宠物类型：（1、狗狗2、企鹅）");
		int c=input.nextInt();
		switch(c){
		case 1:
			dog.setName(name);
			dog.print();
			break;
		case 2:
			pg.setName(name);
			pg.print();

			break;
		default:
			System.out.println("输入错误");
			break;
		}
		
	}

}
