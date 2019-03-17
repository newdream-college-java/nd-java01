package 推箱子游戏;

import java.util.Random;
import java.util.Scanner;

//还差边界人（不能出边界）和箱子判断（不能到达边界）
//人和目标重叠判断（提示无法行走）

public class BoxGame {
	public static void main(String[] args) {
		String[][] maps = new String[10][10];
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		// 绘制地图
		drawMapNo(maps);
		// 绘制目标
		int tx = (0 + maps.length) / 2;
		int ty = (0 + maps.length) / 2;
		maps[tx][ty] = "⭐️";
		// 绘制人
		int px = tx;
		int py = ty;
		while ((px == tx) && (py == ty)) {
			px = random.nextInt(maps.length-2)+1;
			py = random.nextInt(maps.length-2)+1;
		}
		// 绘制箱子
		boolean flag = true;
		int bx = 0;
		int by = 0;
		while (flag) {
			bx = random.nextInt(maps.length-2)+1;
			by = random.nextInt(maps.length-2)+1;
			if (!((bx == px && by == py) || (bx == tx && by == ty))) {
				flag = false;
			}
		}
		// 游戏正式开始
		boolean flag1 = false;
		System.out.println("游戏正式开始（请按w,a,s,d控制人的移动）:");
		System.out.println("规则：将箱子推到目标位置:");
		while(!flag1) {
			maps[bx][by] = "▨";
			maps[px][py] = "囚";
			int a=px;
			int b=py;
			int c=bx;
			int d=by;
			drawMap(maps);
			System.out.println("还未抵达目标(请按w,a,s,d控制人的移动):");
			String operation=input.next();
			switch(operation) {
					//方向键w
					case "w":
						maps[px][py]="□";
						maps[bx][by]="□";
						//箱子在人上面
						px-=1;
						if(bx == px && by == py) {
							bx-=1;
						}
					
						break;
					//方向键a
					case "a":
						maps[px][py]="□";
						maps[bx][by]="□";
						//箱子在人左边
						py-=1;
						if(bx == px && by == py) {
							by-=1;
						}	
						break;
					//方向键s
					case "s":
						maps[px][py]="□";
						maps[bx][by]="□";
						//箱子在人下边
						px+=1;
						if(bx == px && by == py) {
							bx+=1;
						}
						break;
					//方向键d
					case "d":
						maps[px][py]="□";
						maps[bx][by]="□";
						//箱子在人右边
						py+=1;
						if(bx == px && by == py) {
							by+=1;
						}
						break;
						default:
							System.out.println("您的输入有误!请重新输入!");
				}
				if(bx<1||bx>8||by<1||by>8) {
					System.out.println("箱子如果到达地图边界，你无法完成目标！");
					px=a;
					py=b;
					bx=c;
					by=d;
				}
				if(px<0||px>9||py<0||py>9) {
					System.out.println("人无法走出地图！");
					px=a;
					py=b;
					bx=c;
					by=d;
				}
				if(px==5&&py==5) {
					System.out.println("人不能与目标相撞！");
					px=a;
					py=b;
					bx=c;
					by=d;
				}
				//抵达目标，使用标记法标记
				if(bx==tx&&by==ty) {
					flag1=true;
					maps[bx][by] = "▨";
					maps[px][py] = "囚";
					drawMap(maps);
					System.out.println("你完成了游戏");
				}
			}
	}

	// 绘制无目标地图
	public static void drawMapNo(String[][] maps) {
		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps[0].length; j++) {
				maps[i][j] = "□";
			}
		}
	}

	// 绘制有目标有人地图
	public static void drawMap(String[][] maps) {
		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps.length; j++) {
				System.out.print(maps[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//
}
