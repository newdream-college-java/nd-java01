/*����100���ڵ�����֮��*/
public class Test01{
	public static void main(String[] args){
	int i,num=0;
	for(i=1;i<101;i++){
		if(i%2==0){
			continue;
			}
		num+=i;
		}
	System.out.print("����֮�ͣ�"+num);
	}

}