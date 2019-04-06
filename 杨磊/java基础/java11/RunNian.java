package zuoye;

public class RunNian {
	int year;
	public void cha(){
		if((year/4==0&year/100!=0)||year/400==0){
			System.out.println("这是个闰年");
		}else{
			System.out.println("这不是闰年");
		}
	}
}
