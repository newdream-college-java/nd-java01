//��һ�ӵ�һ�٣��ʹ�����پ���ֹ���������
public class Work1{
	public static void main(String []args){
		int sum = 0;
		int i;
		for(i=1;i<=100;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.print(i);
	}
}