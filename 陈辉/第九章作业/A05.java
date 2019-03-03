import java.util.Scanner;
public class A05{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入10个学生的成绩");
		//int arr[]={11};
		//double[]arr=new double[b];//建议数组，放学生的成绩
		int zf=0;
		//double a=0;
		int[]ar=new int[10];
		int m=0,k=0,l=0;
		for(int i=1;i<11;i++){
			System.out.println("请输入第"+i+"学生的chengji");
			 ar[i]=input.nextInt();//输入成绩
			
			zf+=ar[i];  //累加总分
			if(ar[i]<60){
				m++;
				System.out.println("小于60的有"+m);
			}else if(ar[i]>=60&&ar[i]<80){
				k++;
				System.out.println("大于60小于80的有"+k);
			}else if(ar[i]>=80){
				l++;
				System.out.println("大于80分的有"+l);
			}
			
		}
		System.out.println("总分"+zf);
		int avg=zf/10;
		System.out.println("平均分"+avg);
		int max =0;// 变量初始化
		int min =100;
		for(int i=0;i<11;i++){
			if(ar[i]>max){
				max=ar[i];
			}
			/*if(ar[i]<min){
				min=ar[i];
			}*/
		}
		for(int i=1;i<11;i++){
			if(ar[i]<min){
				min=ar[i];
			}
		}
		
		System.out.println("最高分："+max);
		System.out.println("最低分："+min);

	}	
}