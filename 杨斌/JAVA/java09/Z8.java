import java.util.Scanner;
public class Z8{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String[] array=new String[]{"Is","Ocean","Pretty","Sun"};
		String[] arr=new String[5];
		System.out.print("插入前数组排序：");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
		for(int i=1;i<arr.length;i++){
			arr[i]=array[i-1];
			
		}
		System.out.print("\n请输入歌曲名称:");
		String a=input.next();
		
		arr[0]=a;
		int d=0;
		if(arr[0].compareToIgnoreCase(arr[1])<=0){
			d=0;
		}else if(arr[0].compareToIgnoreCase(arr[arr.length-1])>0){
			d=arr.length-1;
		}else if(arr[0].compareToIgnoreCase(arr[arr.length-1])==0){
			d=arr.length-2;
		}else{
			for(int i=1;i<arr.length;i++){	
				if(arr[0].compareToIgnoreCase(arr[arr.length-1])<0&&arr[0].compareToIgnoreCase(arr[i-1])>0)
				d=i-1;
			}
		}
		
		String q=arr[0];
		for(int i=0;i<arr.length;i++){	
			if(d==arr.length-1){				
				arr[i]=arr[i+1];
				if(i+1==arr.length-1){
					arr[i+1]=q;
					break;
				}
			}else if(d==arr.length-2){
				arr[i]=arr[i+1];
				if(i+1==arr.length-2){
					arr[i+1]=q;
					break;
				}
			}else if(d==0){
				break;
			}else{
				
				arr[i]=arr[i+1];
				if(i+1==d){
					arr[i+1]=q;
					break;
				}
			}
				
				
			
		}

		System.out.print("插入后数组排序为:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
}