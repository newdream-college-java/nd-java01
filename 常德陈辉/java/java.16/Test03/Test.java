package Test03;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		String[] arr=new String[5];
		System.out.println("��ӭ������������ƾ��˾��");
		System.out.print("�˿�����������������");
		String name=input.next();
		System.out.print("������Ҫ��ƾ��������");
		int ts=input.nextInt();
		String a;
		int i=0;
		int sum=0;
		do{
			System.out.print("������Ҫ��ƾ����������(1,�γ�  2,�ͳ�3,����):");
			int lx=input.nextInt();
			MotoVehicle cz=new Bus();
			if(lx==1){
				cz.shuchu();
			}else if(lx==2){
				cz=new Car();
				cz.shuchu();
			}else{
				cz=new Dongf();
				cz.shuchu();
			}
			if(arr[i]==null){
				arr[i]=cz.getNo()+"\t"+cz.getBrand();
			}
			i++;
			sum+=cz.getFy()*ts;
			System.out.print("�Ƿ�����⳵��(y/n)");
			a=input.next();
		}while(a.equals("y"));
		System.out.println("�����ƺ�\t\t����Ʒ��");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("�ͻ�������"+name+"����ƾ������"+ts+",��ƾ�ܷ��ã�"+sum);
	}

}
