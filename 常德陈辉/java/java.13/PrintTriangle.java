package cn.zuoye;

public class PrintTriangle {
	public void Xh(){
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("&");
			}
			System.out.println();
		}
	}
}
