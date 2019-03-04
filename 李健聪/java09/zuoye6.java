
public class zuoye6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,3,-1,5,-2};
		int[] newArray=new int[5];
		for(int i=0;i<array.length;i++){
			if(array[i]<0){
				newArray[array.length-i-1]=0;
			}else{
				newArray[array.length-i-1]=array[i];
			}
		}for(int i=0;i<newArray.length;i++){
			System.out.print(newArray[i]+" ");
		}
	}

}
