import java.util.Arrays;
public class Zy8 {
	public static void main(String[] args) {
		String a[]={"Island","Ocean","Pretty","Sun","0"};	
		Arrays.sort(a);
		//��������� 0  ��ʾ����
		for(int i=0;i<a.length-1;i++){
			if(a[i].equals("0")){
				continue;
			}
			System.out.print(a[i]);
		}
		System.out.println();
		String b="Ready";
		int xb=-1;
		System.out.print("�����Ϊ��");
		for(int i=0;i<a.length;i++){
			
			if(b.compareToIgnoreCase(a[i])<0){
				xb=i;
				break;
			}
		}
		if(xb==-1){//�������������0�Ѿ��ڵ�һ��λ����
			for(int i=0;i<a.length-2;i++){
				a[i]=a[i+1];
			}
			a[a.length-2-1]=b;
		}else if(xb==0){
			a[xb]=b;
		}else{
			for(int i=0;i<xb-1;i++){
				a[i]=a[i+1];
			}
			a[xb-1]=b;
		}
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+"\t");
		}
	}
}
