package Test2019_3_6_z13;

public class Triangle {
	public Triangle(int i , int j ,int k) {
		if (i+j>k||i+k>k||j+k>i) {
			if (i==j&&j==k) {
				System.out.println("����һ���ȱ�������");
			}else if (i*i+j*j==k*k||k*k+j*j==i*i||i*i+k*k==j*j) {
				System.out.println("����һ��ֱ�������Ρ�");
			}else if (i*i+j*j<k*k||k*k+j*j<i*i||i*i+k*k<j*j) {
				System.out.println("����һ���۽�������");
			}else {
				System.out.println("����һ���۽�������");
			}
		}else {
			System.out.println("���ܲ����������Σ�����");
		}
	}
}
