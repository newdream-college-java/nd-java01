package Test2019_3_6_z13;

public class MathEmatical {
	// �Ƚ��ҵ����ֵ
	public int a(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}
	//ȡ��λ��
	public int b(int n) {
		return n % 10;
	}
	//����
	public int c(int n) {
		return (int) Math.pow(n, 3);
	}
	//�ۼ�
	public int d(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
}
