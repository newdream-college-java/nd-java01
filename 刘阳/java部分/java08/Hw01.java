/*����1һֱ�ӵ�100��ʲôʱ���ۼӵĺʹ�����500������ѭ��Ȼ�������ʱ�ӵ���ʲô��*/
public class Hw01{
	public static void main(String[] args){
		int sum=0;
		int i=1;
		for(;i<100;i++){
			sum=sum+i;
			if(sum>500){
				System.out.print("��ʱ�ӵ������ǣ�"+i);
				break;
			}
		}
	}
}