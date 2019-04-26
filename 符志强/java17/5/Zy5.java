package 作业;

public class Zy5 implements Zy5jk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zy5jk a=new Zy5jk();
		//不能new个接口
		Zy5jk a=new Zy5();
		System.out.print(a.max);
		int i=50;
		if(i>a.max){
			//a.max-1;
			//a.max-1没有存储的空间
			int t=a.max-1;
		}
	}

}
