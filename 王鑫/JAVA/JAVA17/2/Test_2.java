package Test2019_3_14_z17;

public class Test_2 {
	public static void main(String[] args) {
		//旧手机型号
		Phone_2 mp = new mobilePhone_2();
		mp.xh("G502c的索尼爱立信");
		mp.yy("热雪");
		//旧手机其他功能呢
		mobilePhone_2_1 mp2 = new mobilePhone_2_1();
		mp2.xx();
		mp2.th();
		
		System.out.println();
		
		//新手机型号
		Phone_2 np = new NewPhone_2();
		np.xh("红米Note的小米");
		//新手机其他功能
		NewPhone_2_1 np2= new NewPhone_2_1();
		np2.shuju();
		np2.shiPin("小时代");
		np2.paiZhao();
		np2.xx();
		np2.th();
	}
}
