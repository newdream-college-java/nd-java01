package 第17章接口手机1_2作业;

public class Test {
	public static void main(String[] args) {
		MobilePhone mp =new OldMobilePhone("型号为G502c的索尼爱立信手机:");
		mp.show();
		//需要强转
		OldMobilePhone omp=(OldMobilePhone)mp;
		omp.playMusic();
		omp.sendMessage();
		omp.callSomeone();
		MobilePhone mp1=new ModernPhone("型号为红米Note的小米手机：");
		mp1.show();
		//强转
		System.out.print("\n");
		ModernPhone mmp=(ModernPhone)mp1;
		mmp.startInternet();
		mmp.Vedio();
		mmp.takePhotoes();
		mmp.sendMessage();
		mmp.callSomeone();
	}	
}
