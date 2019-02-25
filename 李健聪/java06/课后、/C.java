//求闰年
public class C{
	public static void main(String[] args){
		for(int i=1900;i<2013;i++){
			if((i%4==0&&i%100!=0)||i%400==0){
				System.out.println(i+"是闰年");
			}
		}
	}
}