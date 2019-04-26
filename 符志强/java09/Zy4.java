import java.util.Arrays;
public class Zy4{
	public static void main(String [] args){
		char a[]={'a','c','u','b','e','p','f','z','0'};
		System.out.println("数组为：acubepfz");
		System.out.print("升序为：");
		Arrays.sort(a);
		//不把上面的 0  显示出来
		for(int i=0;i<9;i++){
			if(a[i]=='0'){
				continue;
			}
			System.out.print(a[i]);
		}
		System.out.println();
		char h='m';	//把插入的 m  赋给一个变量用作比较
		int xb=-1;		//给下标赋个空值要小于0
		System.out.print("插入后为：");
		for(int i=0;i<a.length;i++){
			if(a[i]>=h){
				xb=i;	//找到数组a比 m 大的数下标为几
				break;
			}
		}
		if(xb==-1){//如果没有比 m 大的数	
			/*
			for(int i=0;i<a.length-2;i++){//循环总长度-下标只到8-去为m留了空位
				a[i]=a[i+1];//把后一个数给前一个
			}
			*/
			a[a.length-1]=h;
		}else if(xb==0){
		//进过排序 0 已经为第1了
			a[xb]=h;
		}else{
			for(int i=0;i<xb-1;i++){
				a[i]=a[i+1];//把小于m的数都向前移一位
			}
			a[xb-1]=h;
		}
		for(int j=0;j<a.length;j++){//把插入好的数循环输出
			System.out.print(a[j]);
		}
	}
}