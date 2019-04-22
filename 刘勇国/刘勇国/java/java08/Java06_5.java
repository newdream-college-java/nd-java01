public class Java06_5{
	public static void main(String[] args){
		int kg2=3;
		for(int i=1;i<=4;i++){
			for(int kg=1;kg<i;kg++){
				System.out.print(" ");
			}
			if(i==1||i==4){
				for(int xx=1;xx<=7-2*(i-1);xx++){
					System.out.print("*");
				}
			}else{//´ò2  3ÐÐ
				System.out.print("*");
				for(int j=1;j<=kg2;j++){
					System.out.print(" ");
				}
				System.out.print("*");
				kg2=kg2-2;
			}
			System.out.println();
		}
	}
}