public class B{
	public static void main(String[] args){
		double ss=0.0,hs;
		int i=0;
		System.out.println("摄氏温度为"+"\t\t"+"华氏温度为");
		do{
		hs=ss*(9/5.0)+32;
		System.out.println("摄氏温度为"+ss+"华氏温度为"+hs);
		ss+=20;
		i++;
		}while(i<=9&&ss<=250); 
	}
}