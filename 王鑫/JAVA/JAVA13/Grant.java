package Test2019_3_6_z13;

public class Grant {
	public Grant(int money,int year) {
		if (year==1) {
			//����
			double ll = money*0.0425;
			System.out.println("��ÿ���軹�"+(money+ll)/year/12+"Ԫ");			
		}else if (year<=5) {
			double ll = money*0.0475;
			System.out.println("��ÿ���軹�"+(money+ll)/year/12+"Ԫ");		
		}else {
			double ll = money*0.049;
			System.out.println("��ÿ���軹�"+(money+ll)/year/12+"Ԫ");		
		}
	}
}
