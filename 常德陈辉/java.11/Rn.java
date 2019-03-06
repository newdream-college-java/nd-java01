
public class Rn {
	int a;
	public void ff(){
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.println("是闰年");
		}else{
			System.out.println("是平年");
		}
	}
}
