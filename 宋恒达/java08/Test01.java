/**
**ʹ��forѭ����break���ʵ�֣���1һֱ�ӵ�100��������ۼӵĺʹ���500ҲҪ����ѭ�����������ʱ
**�Ѿ��ӵ�������ʲô
**/
public class Test01{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.println("�ۼӵĺ�Ϊ"+sum);
	}
}