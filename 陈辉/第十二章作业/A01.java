import java.util.Scanner;

public class Game {
    //属性
    //1,人对象
    Person person;
    //2，电脑对象
    Computer computer;
    //3,对战次数
    int count = 0;
    //方法
    //1,初始化----给属性赋值
    public void initial() {
        //1.人对象
        person = new Person();
        //2.电脑对象
        computer = new Computer();
    }
    public void startGame() {//加载
        Scanner input = new Scanner(System.in);
        System.out.println("*******************欢迎，进入游戏世界********************\n");
        System.out.println("\t\t*******************");
        System.out.println("\t\t\t开始");
        System.out.println("\t\t*******************");
        System.out.println("出拳规则：1：石头，2：剪刀，3：布");
        System.out.print("请选择对方角色：（1.刘备，2.孙权，3.曹操)）：");
        int role = input.nextInt();
        switch(role) {
            case 1:
                System.out.println("你选择了刘备对战");
                computer.name="刘备";
                break;
            case 2:
                System.out.println("你选择了孙权对战");
                computer.name="孙权";
                break;
            case 3:
                System.out.println("你选择了曹操对战");
                computer.name="曹操";
                break;
             default:
                 System.out.println("亲，你选择有误！！！");
                    break;
        }
        System.out.print("要开始码？（y/n)）：");
        String isStart = input.next();
        if(isStart.equals("y")) {
            //调用对战的方法
            player();
            //显示结果
            showResult();
            
        } 
    }
    //对战的方法------一个方法干一件事
    public void player() {
       // int count =0;统计局数不能定义再这里，局部变量。
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            //开始对决：
              //1,人出拳
              int ren = person.showFist();
              if(ren>=1&&ren<=3){
            	  
              }else{
            	  System.out.println("程序结束！");
            	  System.exit(0);
              }
              //2,电脑出拳
              int dn = computer.showFist();

              if(ren==dn) {
                  System.out.println("结果说：平局！！！");
              }else if((ren-dn)==-1||(ren-dn)==2) {
                  System.out.println("结果说：人赢了");
                  person.score+=1;
              }else {
                  System.out.println("结果说：电脑赢了，你真笨！！！");
                  computer.score+=1;
              }
              System.out.println("是否开始下一轮比赛(y/n)");
              answer = input.next();
              count++;//每玩一局 对局数+1
          }while(answer.equals("y"));
    }
    //显示最终的对战结果
    public void showResult(){
        System.out.println(computer.name+"\tVS\t"+person.name);
        System.out.println("对战次数："+count);
        if(computer.score>person.score) {
            System.out.println("结果：亲，继续加油！！");
        }else if(computer.score<person.score) {
            System.out.println("结果：小伙子 不错！！！");
        }else {
            System.out.println("跟电脑平局，真的优秀！！！");
        }
        
    }
    

}
