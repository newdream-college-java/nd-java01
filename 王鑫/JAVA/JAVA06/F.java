//����100���ڵ�����֮��


public  class F{
	public static void main(String[] arge){
		int sum = 0;
		for(int i = 1 ; i<100 ; i++){
		//����һ��sum+=i;
		//��������
		sum=sum+(i%2==0?0:i);
		}
		System.out.println(sum);
	}
}