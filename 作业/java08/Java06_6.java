public class Java06_6{
	public static void main(String[] args){
		int kg1=1;
		int kg2=3;
		for(int i=1;i<=7;i++){
			if(i<=4){//前四行打印的空格
				for(int kg=1;kg<=4-i;kg++){
					System.out.print(" ");	
				}
				if(i==1||i==4){
					for(int xx=1;xx<=2*i-1;xx++){
						System.out.print("*");
					}
				}else{
					System.out.print("*");
					for(int j=1;j<=kg1;j++){
						System.out.print(" ");
					}
					System.out.print("*");
					kg1=kg1+2;
				}
				//打印反的
				
			}else{
				for(int kg=1;kg<=i-4;kg++){
						System.out.print(" ");	
					}
					System.out.print("*");
				for(int j=1;j<=kg2;j++){
					System.out.print(" ");
				}
				kg2=kg2-2;
				if(i!=7){
					System.out.print("*");
				}
				
			}
			System.out.print("\n");
		}
	}
}