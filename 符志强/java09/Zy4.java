import java.util.Arrays;
public class Zy4{
	public static void main(String [] args){
		char a[]={'a','c','u','b','e','p','f','z','0'};
		System.out.println("����Ϊ��acubepfz");
		System.out.print("����Ϊ��");
		Arrays.sort(a);
		//��������� 0  ��ʾ����
		for(int i=0;i<9;i++){
			if(a[i]=='0'){
				continue;
			}
			System.out.print(a[i]);
		}
		System.out.println();
		char h='m';	//�Ѳ���� m  ����һ�����������Ƚ�
		int xb=-1;		//���±긳����ֵҪС��0
		System.out.print("�����Ϊ��");
		for(int i=0;i<a.length;i++){
			if(a[i]>=h){
				xb=i;	//�ҵ�����a�� m ������±�Ϊ��
				break;
			}
		}
		if(xb==-1){//���û�б� m �����	
			/*
			for(int i=0;i<a.length-2;i++){//ѭ���ܳ���-�±�ֻ��8-ȥΪm���˿�λ
				a[i]=a[i+1];//�Ѻ�һ������ǰһ��
			}
			*/
			a[a.length-1]=h;
		}else if(xb==0){
		//�������� 0 �Ѿ�Ϊ��1��
			a[xb]=h;
		}else{
			for(int i=0;i<xb-1;i++){
				a[i]=a[i+1];//��С��m��������ǰ��һλ
			}
			a[xb-1]=h;
		}
		for(int j=0;j<a.length;j++){//�Ѳ���õ���ѭ�����
			System.out.print(a[j]);
		}
	}
}