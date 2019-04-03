//Çó1-10µÄ½×³Ë

public class A{
	public static void main(String[] arge){
		for(int i = 1;i<= 10;i++){
			int sum = 1;
			for(int j = 1;j<=i ;j++){
				sum*=j;
				System.out.print(j+"*");
			}
			System.out.println("\b="+sum+"\n");
		}
	}
}