import java.util.Arrays;
public class A08{
	public static void main(String[]args){
		String []arr={"lsland","Ocean","Pretty","Sun","0"};
		//String []ar =new String[]{lsland","Ocean","Pretty","Sun","0"};
		System.out.print("原数组为：lsland+Ocean\t+Pretty+Sun");
		System.out.print("升序后为：");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if(arr[i]=="0"){
				continue;
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		String po="Ready";
		int mm=-1;
		System.out.print("插入后：");
		for(int i=0;i<arr.length;i++){
			if(po.compareToIgnoreCase(arr[i])<0){
				mm=i;
				break;
			}
		}
		if(mm==-1){
			for(int i=0;i<arr.length-2;i++){
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=po;
		}else if (mm==0){
			arr[mm]=po;
		}else{
			for(int i=0;i<mm-1;i++){
				arr[i]=arr[i+1];
			}
			arr[mm-1]=po;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}