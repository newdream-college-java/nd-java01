//ʹ��forѭ����break���ʵ�֣���1һֱ�ӵ�100��������ۼӵĺʹ���500ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô��

public class Test01{
	public static void main(String[] arge){
		int sum = 0 , n=0 ;
		for(int i = 0 ; i< 100 ; i++){
			sum+=n=i;
			if(sum>500){
				break;
			}
		}
		System.out.println(n);
	}
}