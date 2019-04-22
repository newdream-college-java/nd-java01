import java.util.Arrays;
public class Hw03 {
	public static void main(String[] args) {
		int i;
		String[] str= {"a","c","u","b","e","p","f","z"};
		System.out.print("Ô­×Ö·ûÐòÁÐ£º");
		for(i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		Arrays.sort(str);
		System.out.println("\n");
		System.out.print("ÉýÐòÅÅÐòºó£º");
		for(i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println("\n");
		System.out.print("ÄæÐòÊä³öÎª£º");
		for(i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
		
	}

}