package ��ҵ;

public class Computer implements IntelCPU, XJ_HardDisk, JSD_EMS {

	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		System.out.println("Ӳ�������ǣ�500GB");
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		System.out.println("�ڴ������ǣ�4GB");
	}

	@Override
	public void getCPUBrand() {
		// TODO Auto-generated method stub
		System.out.println("CPU��Ʒ���ǣ�Intel");
	}

	@Override
	public void getFrequency() {
		// TODO Auto-generated method stub
		System.out.println("��Ƶ�ǣ�3.8GHz");
	}

}
