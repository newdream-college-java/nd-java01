/*��100~999֮���ˮ�ɻ���*/
public class Hw05{
	public static void main(String[] args){
		int i=100,gw,sw,bw;
		for(;i<=999;i++){
			gw=i%10;
			sw=i/10%10;
			bw=i/100%10;
			if(i==(gw*gw*gw)+(sw*sw*sw)+(bw*bw*bw)){
				System.out.println(i);
			}
		}
	}
}			//����������ĸ�����153��370��371��407