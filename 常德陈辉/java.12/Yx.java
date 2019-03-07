import java.util.Scanner;


public class Yx {
	Yh yh;
	Jsj jsj;
	int a=0;
	public void cqbs(){
		 yh=new Yh();
		 jsj=new Jsj();
	}
	public void showKs(){
		Scanner input= new Scanner(System.in);
		System.out.println("\t\t******************");
		System.out.println("\t\t**  猜拳，开始  **");
		System.out.println("\t\t******************");
		System.out.println("出拳规则：1.剪刀2，石头3，布");
		System.out.print("请选择对方角色（1：刘备2：孙权3：曹操）：");
		int dlm=input.nextInt();
		switch(dlm){
				case 1:
					System.out.println("您选择了刘备对战");
					jsj.name="刘备";
					break;
				case 2:
					System.out.println("您选择了孙权对战");
					jsj.name="孙权";
					break;
				case 3:
					System.out.println("您选择了曹操对战");
					jsj.name="曹操";
					break;
				default:
					System.out.println("您选择有误！！！");
					break;
		}
		System.out.print("要开始吗？（y/n)");
		String ok=input.next();
		if(ok.equals("y")){
			pk();
			jg();
		}
	}
	public void pk(){
		Scanner input=new Scanner(System.in);
		String yok;
		do{
			int ren=yh.showRg();
			int dn=jsj.showDl();
			if(ren==dn){
				System.out.println("结果说：平局");
			}else if(ren-dn==1||ren-dn==-2){
				System.out.println("结果说：你赢了");
				yh.jf++;//人赢的局数
			}else{
				System.out.println("结果说：你输了");
				jsj.jf++;//电脑赢的局数
			}
			System.out.println("是否开始下一轮（y/n）");
			yok=input.next();
			a++;//对局数
		}while(yok.equals("y"));
	}
	public void jg(){
		System.out.println(jsj.name+"\tvs\t"+yh.name);
		System.out.println("对局次数为："+a);
		System.out.println("你的得分为："+yh.jf);
		System.out.println(jsj.name+"的得分为："+jsj.jf);
		if(yh.jf>jsj.jf){
			System.out.println("结局：恭喜你获胜！");
		}else if(yh.jf<jsj.jf){
			System.out.println("结局：你输了！");
		}else{
			System.out.println("结局：平局。。。");
		}
	}
}
