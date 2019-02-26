/*º∆À„1+1/4+1/9+......+1/£®20*20£©*/
public class Test02{
	public static void main(String[] args){
	double num=0;
	int i=1;
	while(i<21){
		num=num+1.0/(i*i);
		i++;
		}
	System.out.print("∫ÕŒ™£∫"+num);
	}

}