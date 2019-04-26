package zz;

import java.util.Scanner;


public class Zylei111 {
	Zylei1 wj1;
	Zylei11 wj2;
	int cs=0;
	public void bb() {
		wj1=new Zylei1();
		wj2=new Zylei11();
	}
	public void a() {
		Scanner input=new Scanner(System.in);
		System.out.println("-------------------------欢迎进入游戏世界------------------------");
		System.out.println();
		System.out.println("\t\t************************************************");
		System.out.println("\t\t**\t\t猜拳，开始\t\t\t**");
		System.out.println("\t\t************************************************");
		System.out.println();
		System.out.println("比赛规则：输入1为出剪刀，输入2为出石头，输入3为出布");
		System.out.println("请选择对方角色（1.刘备 2.孙权 3.曹操）");
		int x=input.nextInt();
		switch (x) {
		case 1:
			System.out.println("你选择了刘备对战");
			wj2.xm="刘备";
			break;
		case 2:
			System.out.println("你选择了孙权对战");
			wj2.xm="孙权";
			break;
		case 3:
			System.out.println("你选择了曹操对战");
			wj2.xm="曹操";
			break;
		default:
			System.out.println("你输入错误");
			break;
		}
        System.out.print("要开始码？（y/n)）：");
		String ss=input.next();
		if(ss.equals("y")){
		while(ss.equals("y")){
			
			int r1=wj1.quan();
			
			int j1=wj2.diannao();
			if (r1==j1) {
				System.out.println("平局");
				cs++;
			}else if ((r1-j1==-1)||(r1-j1==2)) {
				System.out.println("你输了");
				wj2.jifen+=1;
			}else{
				System.out.println("你赢了");
				wj1.jf+=1;
			}
			System.out.println("是否要继续：y");
			ss=input.next();
			cs++;
			if (!ss.equals("y")){
				System.out.println("你输入错误");
				break;
			}
		}
		}else{
			System.out.println("你输入错误");
		}
		
	}
        public void jiguo(){
            System.out.println(wj2.xm+"\tVS\t"+wj1.name);
            System.out.println("对战次数："+cs);
            if(wj2.jifen>wj1.jf) {
                System.out.println("结果：你输了！！");
            }else if(wj2.jifen<wj1.jf) {
                System.out.println("结果：你赢了！！！");
            }else {
                System.out.println("结果：你们平局！！！");
            }
            
        }
}
