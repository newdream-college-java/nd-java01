import java.util.Arrays;
public class Zy3{
	public static void main(String [] args){
		char a[]={'a','c','u','b','e','p','f','z'};
		System.out.println("����Ϊ��acubepfz");
		System.out.print("����Ϊ��");
		Arrays.sort(a);
		System.out.println(a);
		char h=0;
		System.out.print("����Ϊ��");
		for(int j=1;j<a.length;j++){
			for(int i=0;i<a.length-j;i++){
				if(a[i]<a[i+1]){
					h=a[i];
					a[i]=a[i+1];
					a[i+1]=h;		
				}
			}
		}
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]);
		}
	}
}