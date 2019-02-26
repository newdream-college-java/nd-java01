public class ZD{
	public static void main(String[] args){
		int val=123456;
		int fz=0;                                                                                                                        
		while(val!=0){
		fz=fz*10+val%10;
		val/=10;
		}System.out.println(fz);
	}
}