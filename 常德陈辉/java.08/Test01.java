/*ʹ��forѭ����break�����ʵ��1����1һֱ��100��������ۼӵĺʹ���500ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô��*/
public class Test01{
	public static void main(String[] args){
	int sum=0;
	for(int i=1;;i++){
		sum+=i;
		if(sum>500){
			System.out.print("�Ѿ��ӵ�����"+i+"\t��Ϊ��"+sum);
			break;
		}
		}
	}
}