/*���10000-99999��������л�������˵��������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��12321 99999 99899*/
public class Test04{
	public static void main(String[] args){
	int a,b,c,d,i;
	for(i=10000;i<100000;i++){
		a=i/10000%10;
		b=i/1000%10;
		c=i/10%10;
		d=i%10;
		if(a==d&&b==c){
			System.out.println("��������"+i);
			}
		}
	}

}