/*����һ������Ϊ��FlipFlop������ϷӦ�ó�������1������100��
����3�ı�����������ʡ�Flip��������5�ı�����������ʡ�Flop����
��Ϊ3�ı���ҲΪ5�ı����������FliFlop��,������������ǰ���֡�*/
public class A02{
	public static void main(String[] args){
		System.out.println("FlipFlip��ϷӦ�ó���");
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
			}else if(i%5==0){
				System.out.println("Flop");
			}else if(i%3==0){
				System.out.println("Flip");
			}else{
				System.out.println(i);
			}
			
			
			
		}
	}
}