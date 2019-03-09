import java.util.Scanner;
public class TestDogPenguin {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog01 dog=new Dog01();
		Penguin01 penguin=new Penguin01();
		System.out.println("欢迎来到宠物店！");
		System.out.println("请输入要领养宠物的名字：");
		String petname=input.next();
		System.out.println("请输入要领养的宠物类型： （1、狗狗   2、企鹅）");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				dog.setName(petname);
				System.out.println("请选择狗狗的品种： （1、聪明的拉布拉多犬   2、酷酷的雪纳瑞）");
				int choice02=input.nextInt();
					switch(choice02){
						case 1:
							dog.setStrain("聪明的拉布拉多犬");
						break;
						case 2:
							dog.setStrain("酷酷的雪纳瑞");
						break;
					}
				break;
			case 2:
				penguin.setName(petname);
				break;
			default:
				System.out.println("对不起，本店没有这个种类的宠物！");
				System.exit(-1);
		}
		if(choice==1){
			dog.print();
		}else if(choice==2){
			penguin.print();
		}
		
		
	}

}
