public class Zy7 {
	public static void main(String[] args) {
		int array[]={1,3,-1,5,-2}; 
		int[] newArray=new int[5];
		int a=0;
		for(int i=0;i<5;i++){
			newArray[i]=array[i];
			
		}
		a=newArray[0];
		newArray[0]=newArray[4];
		newArray[4]=a;
		a=newArray[1];
		newArray[1]=newArray[3];
		newArray[3]=a;
		for(int i=0;i<5;i++){
			if(newArray[i]<0){
				newArray[i]=0;
			}
			System.out.print(newArray[i]);
		}
	}

}
