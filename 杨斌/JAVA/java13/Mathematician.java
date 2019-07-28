public class Mathematician {
	int max;
	int one;
	int cube;
	int sum;
	public void showMax(int a,int b){
		if(a>b){
			max=a;
			System.out.println(a+"和"+b+"的最大值为:"+max);
		}else if(b>a){
			max=b;
			System.out.println(a+"和"+b+"的最大值为:"+max);
		}else{
			System.out.println("两个数相等");
		}
	}
	public void showOne(int a){
		one=a%10;
		System.out.println(a+"的个位为:"+one);
	}
	public void showCube(int a){
		cube=a*a*a;
		System.out.println(a+"的立方为:"+one);
	}
	public void showSum(int a){
		sum=0;
		for(int i=1;i<=a;i++){
			sum+=i;
		}
		System.out.println("求和为:"+sum);
	}
}
