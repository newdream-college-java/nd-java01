public class Java1_7{
	public static void main(String[] args){
		int []array = {1,3,-1,5,-2};
		int []newArray = new int[5];
		for(int i=array.length-1,j=0;i>=0;i--,j++){
			newArray[j]=array[i];
			if(newArray[j]<0){
				newArray[j]=0;
			}
			
		}
		System.out.println("新数组为：");
		for(int i=0;i<newArray.length;i++){
			System.out.println(newArray[i]);
		}
	}
}