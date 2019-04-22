import java.util.Scanner;


public class Store {
	public static void get(){
		Scanner input=new Scanner(System.in);
		Animal animal = null;
		//选择动物类型
		System.out.println("请选择想要的动物的编号：（1.狗狗 2.猫咪）");
		int choice=input.nextInt();
		if(choice==1){
			animal=new Dog();
		}else if(choice==2){
			animal=new Cat();
		}
		animal.shout();
	}
}
