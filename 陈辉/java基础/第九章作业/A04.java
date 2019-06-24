import java.util.Arrays;
public class A04{
	public static void main(String[]args){
		char arr[]={'a','c','u','b','e','p','f','z','0'};
		System.out.println("原数组为：acubepfz");
		System.out.print("升序后：");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='0'){
				continue;
			}
			System.out.print(arr[i]);
		}
		//找到插入的位子？
		System.out.print("\n");
		char op='m';
		int nm=-1;
		System.out.print("插入后");
		for(int i=0;i<arr.length;i++){
			if(arr[i]>op){
				nm=i;
				break;
			}
		}
		if(nm==-1){
			/*for(int i=0;i<arr.length-2;i++){
				arr[i]=arr[i+1];
			}*/
			arr[arr.length-1]=op;	
		}else if(nm==0){
			arr[nm]=op;//如果下标=0，所以=原来数组长度减去1
		}else{
			for(int i=0;i<nm-1;i++){
				arr[i]=arr[i+1];//把插入m前一位向前移一位
			}
			arr[nm-1]=op;	
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}