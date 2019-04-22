/*打印99乘法表（先打最后一行 最后打第一行）*/
public class Test05{
	public static void main(String[] args){
	for(int i=9;i>0;i--){
		int sum=0;
		int j;
		for(j=i;j>0;j--){
		sum=i*j;
		System.out.print(i+"*"+j+"="+sum+"\t");
		}
	System.out.println();
	}
	}
}