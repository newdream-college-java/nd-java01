import java.util.Arrays;
public class Test3{
	public static void main(String[] args){
		char[] a=new char[]{'a','c','u','b','e','p','f','z'};
		System.out.print("Ԫ�ַ����У�");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.print("\n���������");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n�������Ϊ��");
		for(int i=7;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}