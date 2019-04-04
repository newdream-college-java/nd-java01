
public class Z7 {
	public static void main(String[] args){
		int[] array=new int[]{1,3,-1,5,-2};
		int[] newArray=new int[5];
		for(int i=0;i<newArray.length;i++){
			if(array[newArray.length-(i+1)]>0){
				
		       newArray[i]=array[newArray.length-(i+1)];
			}else{
				newArray[i]=0;
			}
		}
		for(int i=0;i<newArray.length;i++){
			System.out.print(newArray[i]);
		}
	}
}
