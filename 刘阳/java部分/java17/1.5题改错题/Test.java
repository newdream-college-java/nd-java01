
public class Test implements Utility,Constanal {

	public static void main(String[] args) {
		//这里new Constanal是不对的，因为只能用父接口引用指向子类引用
		Constanal con=new Test();
		System.out.println(con.MAX);
		int i=50;
		if(i>con.MAX){
			//应该把Constanal.MAX的MAX属于父接口的静态常量，赋值以后就无法更改了，所以这里报错。
			con.MAX=i;
		}
	}

}
