package Test3;

public class Computer implements CPU,EMS,HardDisk{
	String CPUBrand="Intel";
	Float Frequency=3.8f;
	int size=500;
	int Capacity=4;

	@Override
	public void CPUBrand() {
		// TODO Auto-generated method stub
		System.out.print("CPU的品牌是："+CPUBrand);
	}

	@Override
	public void Frequency() {
		// TODO Auto-generated method stub
		System.out.println("，主频是："+Frequency+"GHz");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("硬盘容量是："+size+"GB");
	}

	@Override
	public void Capacity() {
		// TODO Auto-generated method stub
		System.out.println("内存容量是："+Capacity+"GB");
	}
	public void showInfo(){
		System.out.println("计算机的信息如下：");
	}

}
