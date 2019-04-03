package Test2019_3_6_z13;

public class Triangle {
	public Triangle(int i , int j ,int k) {
		if (i+j>k||i+k>k||j+k>i) {
			if (i==j&&j==k) {
				System.out.println("这是一个等边三角形");
			}else if (i*i+j*j==k*k||k*k+j*j==i*i||i*i+k*k==j*j) {
				System.out.println("这是一个直角三角形。");
			}else if (i*i+j*j<k*k||k*k+j*j<i*i||i*i+k*k<j*j) {
				System.out.println("这是一个钝角三角形");
			}else {
				System.out.println("这是一个钝角三角形");
			}
		}else {
			System.out.println("这能不构成三角形！！！");
		}
	}
}
