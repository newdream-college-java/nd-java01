/*输出计算100+101+102+......+200之和。*/
public class Test01{
	public static void main(String[] args){
	int num=0;
	int i=100;
	while(i<201){
		num+=i;
		i++;
		}
	System.out.print("和为："+num);
	}

}