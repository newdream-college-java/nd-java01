
public class Loan {
	double hk;
	double lx;
	double ll;
	public void show(int money,int year){
		lx=money*ll;
		hk=(money+lx)/(year*12);
		System.out.println("����ϢΪ��"+lx);
		System.out.println("�»�����Ϊ��"+hk);
	}
}
