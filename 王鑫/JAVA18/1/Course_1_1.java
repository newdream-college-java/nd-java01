package Test2019_3_17_z18;

public class Course_1_1 {
	public Course_1_1(int n) {
		// TODO Auto-generated constructor stub
		try {
			if (n==1) {
				System.out.println("C#���");
			}else if (n==2) {
				System.out.println("JAVA���");
			}else if (n==3) {
				System.out.println("SQL �� ��");
			}else{ 
				throw new Exception();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����������");
			System.out.println("��ӭ�������");
		}
	}
}
