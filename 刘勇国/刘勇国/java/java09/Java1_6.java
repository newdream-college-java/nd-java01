import java.util.Scanner;
public class Java1_6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int []arr = new int[10];
		int hefa=0;
		int feifa=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"������");
			arr[i]=input.nextInt();
			if(arr[i]==1||arr[i]==2||arr[i]==3){
				System.out.println("�Ϸ��ַ�");
				hefa++;
			}else{
				System.out.println("�Ƿ��ַ�");
				feifa++;
			}

		}
		System.out.println("�Ϸ��ַ���"+hefa+"�Ƿ��ַ�"+feifa);
	}
}