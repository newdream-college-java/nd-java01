import java.util.Scanner;

public class Game{
	Com com;
	Player player;
	int count=0;
	//初始化
    public void initial() {
        //1.人对象
    	player = new Player();
    	player.name="刘阳";
        //2.电脑对象
        com = new Com();
    }
    
	public void startGame(){
		System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------\n\n");
		System.out.println("                ***************                \n");
		System.out.println("                *** 猜拳 ，开始 ***                \n");
		System.out.println("                ***************                \n\n");
		System.out.println("出拳规则：1.石头 2.剪刀 3.布");
		System.out.println("请选择对方角色（1：刘备 2：孙权 3.曹操）");
	}
	public int choiceHero(){
		Scanner input=new Scanner(System.in);
		int juese=0;
		if(input.hasNextInt()){
			juese=input.nextInt();
			switch(juese){
				case 1:
					System.out.println("即将与刘备对战\n"+"刘备：狗贼！前来受死！二弟三弟一起上！");
					com.name="刘备";
					break;
				case 2:
					System.out.println("即将与孙权对战\n"+"孙权：快快呼叫周瑜大都督！");
					com.name="孙权";
					break;
				case 3:
					System.out.println("即将与曹操对战\n"+"曹操：宁教我负天下人，不教天下人负我！");
					com.name="曹操";
					break;
				default:
					System.out.println("选择无效，请重新选择正确的对手号码：");
					System.out.println("请选择对方角色（1：刘备 2：孙权 3.曹操）");
					choiceHero();
			}
		}else{
			System.out.println("选择无效，请重新选择正确的对手号码：");
			System.out.println("请选择对方角色（1：刘备 2：孙权 3.曹操）");
			choiceHero();
		}
		
		System.out.print("要开始码？（y/n)）：");
        String gameStart = input.next();
        if("y".equals(gameStart)){
        	duiZhan();
        	showResult();
        }
        return juese;
	}
	//对战的方法
	public void duiZhan(){
		Scanner input=new Scanner(System.in);
		String nextround;
		//因为要先执行一遍再问是否继续，所以这里用的是do-while语句。
		do{
			//开始对决
			//人先出拳
			int wanjia=player.chuquan();
			//电脑出拳
			int diannao=com.chuquan();
			if(wanjia-diannao==0){
				System.out.println("结果：棋逢对手，将遇良才！此乃平局！！！");
			}else if(wanjia-diannao==-1||wanjia-diannao==2){
				System.out.println("结果：您真乃神人，恭喜您赢了！");
                player.score+=1;
			}else{
				System.out.println("结果：人算不如天算，再接再厉吧！！！");
                com.score+=1;
			}
			System.out.println("是否开始下一轮比赛(y/n)");
            nextround = input.next();
            count++;//每玩一局 对局数+1
		}while("y".equals(nextround));
	}
	//显示最终的对战的结果！！！！！！
	public void showResult(){
		System.out.println(com.name+"\tVS\t"+player.name);
        System.out.println("对战次数："+count);
        System.out.println(com.score+"\tVS\t"+player.score);
        if(com.score>player.score) {
            System.out.println("结果：兽人永不为奴，再重新来过可好？！！");
        }else if(com.score<player.score) {
            System.out.println("结果：恭喜您荣登宝座，一统中原！！！");
        }else {
            System.out.println("结果：两个傻子！！！");
        }
	}
}
