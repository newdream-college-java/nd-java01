/**
**打印99乘法表（先打最后一行再打第一行）
**/
public class Test05{
	public static void main(String[] args){
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
}
