/*��100-999֮���ˮ�ɻ����������磺ˮ�ɻ���153=1*1*1+5*5*5+3*3*3��*/
public class Test05{
	public static void main(String[] args){
	int i;
	for(i=100;i<1000;i++){
		int a,b,c;
		a=i/100%10;
		b=i/10%10;
		c=i%10;
		if(i==a*a*a+b*b*b+c*c*c){
			System.out.println("ˮ�ɻ���"+i);
			}
		}
	}

}