import java.util.Scanner;
public class Z2{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog2 dog=new Dog2("无名氏","聪明的拉布拉多犬");		
		Penguin2 pg=new Penguin2("无名氏","Q仔");
		Pig pig=new Pig("无名氏","白色");
		System.out.println("欢迎您来到宠物店");
		System.out.print("请输入要领养宠物的名字");
		String name=input.next();
		System.out.print("请选择要领养的宠物类型：（1、狗狗2、企鹅3、猪）");
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
		case 3:
			pig.setName(name);
			pig.print();

			break;
		default:
			System.out.println("输入错误");
			break;
		}
		
	}

}
