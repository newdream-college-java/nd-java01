package java16;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ��һ�������Ѿ�ʵ������������ϵͳ�ļ򵥼Ƽ۹��ܣ�
 * �ͻ���������һ��ĳ���ͺŵ����������졣��������ҵ������
 * �ͻ��������޶�����ͬƷ�ƵĲ�ͬ�ͺŵ����������죨һ���ͻ����޵ĸ�����������������ͬ����
 * Ҫ�����������޼�
 * 
 * 
 * �������޿���ҵ�����޷����ö�λ���㣬ÿ��ÿ��Ƽ�50Ԫ
 * Ҫ���ϵͳ������չ�������������޵������
 * @author mo
 *
 */
public class Test03 {
	public static void main(String[] args) {
		List<MotoVehicle> motoVehicles=new ArrayList<MotoVehicle>();
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����������޹�˾��");
		System.out.print("��������������:");
		int days=input.nextInt();
		MotoVehicle motoVehicle=null;
		do {
			System.out.print("������Ҫ���޵��������ͣ�1.�γ� 2.�ͳ� 3.������");
			int motoVehicleType=input.nextInt();
			if(motoVehicleType==1) {
				motoVehicle=new Car();
				System.out.print("��ѡ��Ҫ���޵Ľγ�Ʒ��:(1.���� 2.���)");
				int carBrand=input.nextInt();
				if(carBrand==1) {
					motoVehicle.setBrand("����");
					((Car)motoVehicle).setType("����");
					motoVehicle.setNo("��NNN4324");
				}else {
					motoVehicle.setBrand("���");
					System.out.print("������Ҫ���޵ı�����ͣ���1.������ 2.����GL8��");
					int type=input.nextInt();
					if(type==1) {
						((Car)motoVehicle).setType("������");
						motoVehicle.setNo("��NY298588");
					}else if(type==2) {
						((Car)motoVehicle).setType("GLB");
						motoVehicle.setNo("��NNN3284");
					}
					
				}
			}else if(motoVehicleType==2){
				motoVehicle=new Bus();
				System.out.print("������Ҫ���޵Ŀͳ�����:(1.�� 2.����)");
				int busType=input.nextInt();
				if(busType==1) {
					motoVehicle.setBrand("��");
				}else if(busType==2) {
					motoVehicle.setBrand("����");
				}
				System.out.print("������Ҫ���޵���λ����(1.<=16 2.>16)");
				int seatCount=input.nextInt();
				if(seatCount==1) {
					((Bus)motoVehicle).setSeatCount(16);
					motoVehicle.setNo("��NT43765");
				}else if(seatCount==2) {
					((Bus)motoVehicle).setSeatCount(32);
					motoVehicle.setNo("��564765");
				}
			}else if(motoVehicleType==3) {
				motoVehicle=new Truck();
				motoVehicle.setBrand("����");
				System.out.print("����������Ҫ������:");
				int weight=input.nextInt();
				((Truck)motoVehicle).setWeight(weight);
				motoVehicle.setNo("��AU7865");
				
			}
			motoVehicles.add(motoVehicle);
			System.out.print("��ѡ���Ƿ���������������ͣ���y/n��");
			String answer=input.next();
			if(answer.equals("n")) {
				break;
			}
		}while(true);
		System.out.println(motoVehicles.size());
		System.out.println("�����ƺ�\t\t����Ʒ��");
		for(int i=0;i<motoVehicles.size();i++) {
			System.out.println(motoVehicles.get(i).getNo()+"\t\t"+motoVehicles.get(i).getBrand());
		}
		System.out.println("����������"+days+",�����ܷ��ã�"+calAllRent(motoVehicles, days));
	}
	public static int calAllRent(List<MotoVehicle> motoVehicles,int days) {
		int sum=0;
		for(int i=0;i<motoVehicles.size();i++) {
			sum+=motoVehicles.get(i).calcRent(days);
		}
		return sum;
	}
}
