/**
**����һ������Ϊ��FlipFlop������ϷӦ�ó�������1������100������3�ı�����������ʡ�Flip����
**����5�ı�����������ʡ�Flop������Ϊ3�ı���ҲΪ5�ı����������FlipFlop�����������
**�����ǰ����
**/
public class Test02{
	public static void main(String[] args){
		int i=1;
		while(i<=100){
			if(i%3==0){
				System.out.println("Flip");
			}else if(i%5==0){
				System.out.println("Flop");
			}else{
				System.out.println(i);
			}
			i++;
		}
	}
}