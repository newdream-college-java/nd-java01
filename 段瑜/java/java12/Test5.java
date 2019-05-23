package 人机猜拳;

import java.util.Scanner;

public class Test5 {
	Test1 com = new Test1();
	Test2 ren=new Test2();
	int count=0;
	public void show1(){
		Scanner input=new Scanner(System.in);
		String xuanze;
		System.out.print("请出拳：");
		do{			
			int r=ren.renC();			
			int j=com.jqr();
			if(r==j){
				 System.out.println("结果说：平局！！！");
			}else if((r-j)==-1||(r-j)==2){
				System.out.println("结果说："+ren.name1+"赢了");
				ren.score+=1;
			}else if((j-r)==2||(j-r)==-1){
				System.out.println("结果说："+com.name+"赢了");
				com.score+=1;
			}else{
				System.out.println("输入错误，游戏结束");
				System.exit(-1);
			}
			System.out.print("是否开始下一局比赛（y/n）：");
			xuanze=input.next();
			count+=1;
		}while(xuanze.equals("y"));
	}
	public void show2(){
		System.out.println(com.name+"\tVS\t"+ren.name1);
        System.out.println("对战次数："+count);
        if(com.score>ren.score) {
            System.out.println("结果："+com.name+"亲，继续加油！！");
        }else if(com.score<ren.score) {
            System.out.println("结果："+ren.name1+"小伙子 不错！！！");
        }else {
            System.out.println("结果：你的两个肩膀抗的也是电脑！！！");
        }
	}
	public void show(){
		System.out.println("\t\t\t--------欢迎进入游戏世界--------");
		System.out.println("\t\t\t***********************");
		System.out.println("\t\t\t**\t猜拳，开始\t**");
		System.out.println("\t\t\t***********************\n\n\n");
		System.out.println("出拳规则：1.石头 2.剪刀 3.布");
		System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）：");
		Scanner input=new Scanner(System.in);
		int sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("您选择了1.刘备对战");
				com.name="刘备";
				break;
			case 2:
				System.out.println("您选择了2.孙权对战");
				com.name="孙权";
				break;
			case 3:
				System.out.println("您选择了3.曹操对战");
				com.name="曹操";
				break;
		}
		System.out.print("是否开始对局（y/n）：");
		String isStart = input.next();
		if(isStart.equals("y")){
			show1();
			show2();
		}
	}
}
