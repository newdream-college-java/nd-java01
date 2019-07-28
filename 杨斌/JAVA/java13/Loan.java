
public class Loan {
	double hk;
	double lx;
	double ll;
	public void show(int money,int year){
		lx=money*ll;
		hk=(money+lx)/(year*12);
		System.out.println("总利息为："+lx);
		System.out.println("月还款金额为："+hk);
	}
}
