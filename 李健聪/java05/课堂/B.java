public class B{
	public static void main(String[] args){
		double ss=0.0,hs;
		int i=0;
		System.out.println("�����¶�Ϊ"+"\t\t"+"�����¶�Ϊ");
		do{
		hs=ss*(9/5.0)+32;
		System.out.println("�����¶�Ϊ"+ss+"�����¶�Ϊ"+hs);
		ss+=20;
		i++;
		}while(i<=9&&ss<=250); 
	}
}