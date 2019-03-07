package Test2019_3_6_z13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\t第十三章的作业题号！！！");
		System.out.println("\t\t1:CustmerBiz");
		System.out.println("\t\t2:Person");
		System.out.println("\t\t3:Students");
		System.out.println("\t\t4:Account");
		System.out.println("\t\t5:Dy");
		System.out.println("\t\t6:MathEmatical");
		System.out.println("\t\t7:counter");
		System.out.println("\t\t阔选题(0)");
		System.out.print("请输入题号：");
		int n = input.nextInt();
		switch(n){
			case 1:{
				CustmerBiz cb = new CustmerBiz();
				cb.insert();
				cb.show();
				break;
			}case 2:{
				System.out.println("--------人员信息--------");
				Person pe = new Person();
				pe.Person();
				break;
			}case 3:{
				Students stu = new Students();
				stu.insertStudents();
				stu.showStudents();
				stu.reviseStudents();
				break;	
			}case 4:{
				Account ac = new Account();
				do {
					System.out.println("1.存款 2.取款 0.退出");
					System.out.print("请选择你需要办理的业务：");
					n = input.nextInt();
					if (n==1) {
						System.out.print("请输入存款金额：");
						ac.ck(input.nextInt());						
					}else if (n==2) {
						System.out.println("请输入取款金额");
						ac.qk(input.nextInt());	
					}else if (n!=0) {
						System.out.println("输入错误请重新输入！！");
					}
				} while (n!=0);		
			}case 5:{
				System.out.print("请输入行：");
				n = input.nextInt();
				System.out.print("请输入打印的字符：");
				String m = input.next();
				Dy dy = new Dy();
				dy.printTriangle(n,m);
				break;		
			}case 6:{
				MathEmatical me = new MathEmatical();
				System.out.print("请选择你要计算的对应的编号(a-d,0结束)：");
				String p = input.next();
				while (!p.equals("0")) {
					switch (p) {
					case "a"://两数之间的最大值
						System.out.print("请输入第一个整数：");
						n=input.nextInt();
						System.out.print("请输入第二个整数：");
						int m= input.nextInt();
						System.out.println(n+" 和 "+m+"之间 "+me.a(n,m)+" 最大 ");
						break;
					case "b"://找个位数
						System.out.print("请输入一个整数：");
						n=input.nextInt();						
						System.out.println(me.b(n));
						break;
					case "c"://求立方
						System.out.print("请输入一个整数：");
						n = input.nextInt();
						System.out.println(me.c(n));					;
						break;
					case "d"://1-n的累加
						System.out.print("请输入一个整数：");
						n = input.nextInt();
						System.out.println(me.d(n));
						break;
					}
					System.out.print("请选择你要计算的对应的编号(a-d,0结束)：");
					p = input.next();				
				}				
			}case 7:{
				System.out.print("请输入你贷款的金额：");
				int money = input.nextInt();
				System.out.print("请输入你还款年限：");
				int year = input.nextInt();
				Grant cou = new Grant(money, year);	
			}case 8:{
				//附加题
				String s = "a";
				while (!s.equals("n")) {
					System.out.print("请输入第一条边：");
					int i = input.nextInt();
					System.out.print("请输入第二条边：");
					int j = input.nextInt();
					System.out.print("请输入第三条边：");
					int k = input.nextInt();
					Triangle tri = new Triangle(i,j,k);	
					System.out.print("继续吗？（y/n）:");
					s = input.next();
					while (!s.equals("n")&&!s.equals("y")) {
						System.out.print("请正确输入是否继续（y/n）：");
						s = input.next();
					}
				}
				System.out.println("谢谢使用！");
			}
		}
	}
}
