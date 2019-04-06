package 作业;
import java.util.Scanner;


public class Person {
    // 属性----名字，积分
    String name="匿名";
    int score;

    // 方法--出拳
    public int showFist() {
        Scanner input = new Scanner(System.in);
        System.out.print("请出拳：1：石头，2：剪刀，3：布(输入对应的数字)：");
        int choice = -1;
        //输入是非数字？
        if(input.hasNextInt()) {
            choice  = input.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("你出拳：石头");
                break;
            case 2:
                System.out.println("你出拳：剪刀");
                break;
            case 3:
                System.out.println("你出拳：布");
                break;
             default:
                 System.out.println("亲，你输入有误！！");
                break;
        }
       return choice;
    }
}
