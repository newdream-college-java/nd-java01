package Zy;

public class Zytest6 {
	int year;
	public void main(){
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
			
	}
}
