public class Mathematician {
	int max;
	int one;
	int cube;
	int sum;
	public void showMax(int a,int b){
		if(a>b){
			max=a;
			System.out.println(a+"��"+b+"�����ֵΪ:"+max);
		}else if(b>a){
			max=b;
			System.out.println(a+"��"+b+"�����ֵΪ:"+max);
		}else{
			System.out.println("���������");
		}
	}
	public void showOne(int a){
		one=a%10;
		System.out.println(a+"�ĸ�λΪ:"+one);
	}
	public void showCube(int a){
		cube=a*a*a;
		System.out.println(a+"������Ϊ:"+one);
	}
	public void showSum(int a){
		sum=0;
		for(int i=1;i<=a;i++){
			sum+=i;
		}
		System.out.println("���Ϊ:"+sum);
	}
}
