import java.util.Arrays;
public class A04{
	public static void main(String[]args){
		char arr[]={'a','c','u','b','e','p','f','z','0'};
		System.out.println("ԭ����Ϊ��acubepfz");
		System.out.print("�����");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='0'){
				continue;
			}
			System.out.print(arr[i]);
		}
		//�ҵ������λ�ӣ�
		System.out.print("\n");
		char op='m';
		int nm=-1;
		System.out.print("�����");
		for(int i=0;i<arr.length;i++){
			if(arr[i]>op){
				nm=i;
				break;
			}
		}
		if(nm==-1){
			/*for(int i=0;i<arr.length-2;i++){
				arr[i]=arr[i+1];
			}*/
			arr[arr.length-1]=op;	
		}else if(nm==0){
			arr[nm]=op;//����±�=0������=ԭ�����鳤�ȼ�ȥ1
		}else{
			for(int i=0;i<nm-1;i++){
				arr[i]=arr[i+1];//�Ѳ���mǰһλ��ǰ��һλ
			}
			arr[nm-1]=op;	
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}