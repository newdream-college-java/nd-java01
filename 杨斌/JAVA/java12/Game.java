import java.util.Scanner;
public class Game {
	Person person;
	Computer computer;
	int conunt;
	public void initial(){
		person=new Person();
		computer=new Computer();
	//	person.name="匿名";
		person.score=0;
		computer.score=0;
		conunt=0;
	}
	public void show(){
		Scanner input= new Scanner(System.in);
		System.out.println("-----------欢迎进入游戏世界-----------");
		System.out.println("\t**********");
		System.out.println("\t**猜拳，开始**");
		System.out.println("\t**********");
		System.out.println("出拳规则:1.剪刀2.石头3.布");
		System.out.print("请选择对方角色（1：刘备2：孙权3：曹操）");
		int js=0;
		if(input.hasNextInt()){
			 js=input.nextInt();
		}
		switch(js){
			case 1:
				computer.name="刘备";
				break;
			case 2:
				computer.name="孙权";
				break;
			case 3:
				computer.name="曹操";
				break;
			default:
				System.out.println("输入错误");
				break;
		
		}
		System.out.println("请输入你的姓名:");
		person.name=input.next();
		System.out.println(person.name+"VS"+computer.name);
		System.out.println("要开始吗（y/n）：");
		String a=input.next();
		if(a.equals("y")){
			start();
		}else{
			System.exit(-1);
		}
	}
	public void start(){
		Scanner q=new Scanner(System.in);
		String c=null;
		do{
			int a=person.showFist();
			int b=computer.jsj();
			if(a==b){
				System.out.println("结果说：和局，真衰！嘿嘿，等着瞧吧！");
			}else if(a-b==1||a-b==-2){
				System.out.println("结果说：恭喜你，你赢了！");
				person.score++;
			}else{
				System.out.println("结果说：你输了，真笨！");
				computer.score++;
			}
			conunt++;
			System.out.println("是否开始下一轮（y/n）：");
			c=q.next();
			System.out.println("-------------------------------------------------------");
		}while(c.equals("y"));
	}
	public void jg(){
		System.out.println(computer.name+"VS"+person.name);
		System.out.println("对战次数"+conunt+"\n");
		System.out.println("姓名\t得分");
		System.out.println(person.name+"\t"+person.score);
		System.out.println(computer.name+"\t"+computer.score+"\n");
		if(person.score>computer.score){
			System.out.println("结果:恭喜，恭喜");
		}else{
			System.out.println("结果:很遗憾，你被淘汰了");
		}
	}
}
