/*����һ������Ϊ��FlipFlop������ϷӦ�ó�������1������100������3���������뵥�ʡ�Flip��������5�ı��������뵥�ʡ�Flop������Ϊ3�ı���ҲΪ5�ı����������FlipFlop������������������ǰ���֡�*/
public class Test02{
	public static void main(String[] args){
	int i;
	for(i=1;i<101;i++){
		if(i%3==0&&i%5==0){
			System.out.println("FlipFlop");
			}else if(i%3==0){
			System.out.println("Filp");
			}else if(i%5==0){
			System.out.println("Flop");
			}else{
			System.out.println(i);
			}
		}
	}

}