/*输出1900-2012的闰年*/
public class Test03{
	public static void main(String[] args){
	int i;
	for(i=1900;i<2013;i++){
		if((i%4==0&&i%100!=0)||i%400==0){
			System.out.println("1900-2012的闰年"+i);
			}
		}
	}

}