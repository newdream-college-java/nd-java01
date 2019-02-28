/*输出1900-2012的闰年。*/
public class A03{
	public static void main(String[] args){
		for(int i=1900;i<=2012;i++){
			if(i%100==0&&i%4==0){
				System.out.println("1900-2012的闰年："+i);
			}
		}
	}
}