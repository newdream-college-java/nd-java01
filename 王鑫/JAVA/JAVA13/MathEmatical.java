package Test2019_3_6_z13;

public class MathEmatical {
	// 比较找到最大值
	public int a(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}
	//取个位数
	public int b(int n) {
		return n % 10;
	}
	//开方
	public int c(int n) {
		return (int) Math.pow(n, 3);
	}
	//累加
	public int d(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
}
