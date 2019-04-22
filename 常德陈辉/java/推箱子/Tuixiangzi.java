import java.util.Random;
import java.util.Scanner;


public class Tuixiangzi {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		String[][] bk=new String[11][11];
		//边框
		for (int i = 0; i < bk.length; i++) {
			for (int j = 0; j < bk[0].length; j++) {
				bk[i][j]="口";
			}
		}
		//终点位置
		int zx=bk.length/2;
		int zy=bk[0].length/2;
		bk[zx][zy]="★";
		//人开始的位置
		int rx=zx;
		int ry=zy;
		while(rx==zx&&ry==zy){
			rx=rd.nextInt(10);
			ry=rd.nextInt(10);
		}
		bk[rx][ry]="囚";
		//箱子开始的位置
		int xx=zx;
		int xy=zy;
		while(xx==zx&&xy==zy||xx==rx&&xy==ry){
			xx=rd.nextInt(8)+1;
			xy=rd.nextInt(8)+1;
		}
		bk[xx][xy]="困";
		//输出样子
		for (int i = 0; i < bk.length; i++) {
			for (int j = 0; j < bk[0].length; j++) {
				System.out.print(bk[i][j]+"   "); 
			}
			System.out.println();
		}
		while(true){
			System.out.print("请输入人前进方向方向（w:向上，s:向下，a:向左，d:向右）：");
			String fy=input.next();
			if(fy.equals("w")){
				System.out.println("向上");
				if(rx-1==xx&&ry==xy){//人上面有箱子
//					if(xx==0){//箱子靠近边界
//						System.out.println("您已经进入死局！");
//					}else{
						bk[xx-1][xy]="困";
						bk[rx-1][ry]="囚";
						bk[rx][ry]="口";
						xx=xx-1;
						rx=rx-1;
						if(xx==0){//箱子在边界
							bk[xx][xy]="困";
							bk[rx][ry]="囚";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("您已经进入死局！程序终止");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//到达终点
							bk[xx][xy]="★";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("恭喜您成功过关！");
							System.exit(1);
						}
					//}
				}else if(rx-1==zx&&ry==zy){//人向上走进过终点
					if(xx+1==zx&&xy==zy){
						bk[xx-1][xy]="困";
						xx=xx-1;
					}
					bk[rx-2][ry]="囚";
					bk[rx][ry]="口";
					rx=rx-2;
				}else{//人向上走没有没有任何物体
					if(rx==0){
						System.out.println("您已在边界了不能在向上了！");
					}else{
						bk[rx-1][ry]="囚";
						bk[rx][ry]="口";
						rx=rx-1;
					}
				}
			}else if(fy.equals("s")){
				System.out.println("向下");
				if(rx+1==xx&&ry==xy){//人下面有箱子
						bk[xx+1][xy]="困";
						bk[rx+1][ry]="囚";
						bk[rx][ry]="口";
						xx=xx+1;
						rx=rx+1;
						if(xx==bk.length-1){//箱子在边界了
							bk[xx][xy]="困";
							bk[rx][ry]="囚";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("您已经进入死局！程序终止");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//到达终点
							bk[xx][xy]="★";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("恭喜您成功过关！");
							System.exit(1);
						}
				}else if(rx+1==zx&&ry==zy){//人向下走进过终点
					if(xx-1==zx&&xy==zy){
						bk[xx+1][xy]="困";
						xx=xx+1;
					}
					bk[rx+2][ry]="囚";
					bk[rx][ry]="口";
					rx=rx+2;
				}else{//人向下走没有没有任何物体
					if(rx==bk.length-1){
						System.out.println("您已在边界了不能在向下了！");
					}else{
						bk[rx+1][ry]="囚";
						bk[rx][ry]="口";
						rx=rx+1;
					}
				}
			}else if(fy.equals("a")){
				System.out.println("向左");
				if(rx==xx&&ry-1==xy){//人左面有箱子
						bk[xx][xy-1]="困";
						bk[rx][ry-1]="囚";
						bk[rx][ry]="口";
						xy=xy-1;
						ry=ry-1;
						if(xy==0){//箱子进入边界
							bk[xx][xy]="困";
							bk[rx][ry]="囚";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("您已经进入死局！程序终止");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//到达终点
							bk[xx][xy]="★";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("恭喜您成功过关！");
							System.exit(1);
						}
				}else if(rx==zx&&ry-1==zy){//人向左走进过终点
					if(xx==zx&&xy+1==zy){
						bk[xx][xy-1]="困";
						xy=xy-1;
					}
					bk[rx][ry-2]="囚";
					bk[rx][ry]="口";
					ry=ry-2;
				}else{//人向左走没有没有任何物体
					if(ry==0){
						System.out.println("您已在边界了不能在向左了！");
					}else{
						bk[rx][ry-1]="囚";
						bk[rx][ry]="口";
						ry=ry-1;
					}
				}
			}else if(fy.equals("d")){
				System.out.println("向右");
				if(rx==xx&&ry+1==xy){//人右面有箱子
						bk[xx][xy+1]="困";
						bk[rx][ry+1]="囚";
						bk[rx][ry]="口";
						xy=xy+1;
						ry=ry+1;
						if(xy==bk[0].length-1){//箱子进入边界
							bk[xx][xy]="困";
							bk[rx][ry]="囚";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("您已经进入死局！程序终止");
							System.exit(1);
						}
						if(xx==zx&&xy==zy){//到达终点
							bk[xx][xy]="★";
							for (int i = 0; i < bk.length; i++) {
								for (int j = 0; j < bk[0].length; j++) {
									System.out.print(bk[i][j]+"   "); 
								}
								System.out.println();
							}
							System.out.println("恭喜您成功过关！");
							System.exit(1);
						}
				}else if(rx==zx&&ry+1==zy){//人向右走进过终点
					if(xx==zx&&xy-1==zy){
						bk[xx][xy+1]="困";
						xy=xy+1;
					}
					bk[rx][ry+2]="囚";
					bk[rx][ry]="口";
					ry=ry+2;
				}else{//人向右走没有没有任何物体
					if(ry==bk[0].length-1){
						System.out.println("您已在边界了不能在向右了！");
					}else{
						bk[rx][ry+1]="囚";
						bk[rx][ry]="口";
						ry=ry+1;
					}
				}
			}else{
				System.out.println("您输入有误！！！");
			}
			//重绘样子
			for (int i = 0; i < bk.length; i++) {
				for (int j = 0; j < bk[0].length; j++) {
					System.out.print(bk[i][j]+"   "); 
				}
				System.out.println();
			}
		}
	}
}
