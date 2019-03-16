package 作业;

public class Computer implements IntelCPU, XJ_HardDisk, JSD_EMS {

	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		System.out.println("硬盘容量是：500GB");
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		System.out.println("内存容量是：4GB");
	}

	@Override
	public void getCPUBrand() {
		// TODO Auto-generated method stub
		System.out.println("CPU的品牌是：Intel");
	}

	@Override
	public void getFrequency() {
		// TODO Auto-generated method stub
		System.out.println("主频是：3.8GHz");
	}

}
