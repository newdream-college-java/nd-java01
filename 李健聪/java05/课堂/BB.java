//��1~100�ĺ͵�����500ʱ��i��λ��
public class BB{
	public static void main(String[] args){
		int i=1,sum=0;
		while(i<=100){
			sum+=i;
			i++;
			if(sum>500){
				System.out.println("���ʹ���500ʱ���ӵ�"+(i-1)+"λ��");
				System.exit(-1);
			}
			
			
		}
	}
}