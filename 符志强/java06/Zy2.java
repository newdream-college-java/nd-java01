public class Zy2{
	public static void main(String[] arge){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FilpFiop");
			}else
			{
				
				if(i%3==0){
					System.out.println("Filp");
				}else
				{
			
					if(i%5==0){
						System.out.println("Fiop");
					}else
					{
						System.out.println(i);
					}
					
				}
			}
		}
	}
}