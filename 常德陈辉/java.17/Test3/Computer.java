package Test3;

public class Computer implements CPU,EMS,HardDisk{
	String CPUBrand="Intel";
	Float Frequency=3.8f;
	int size=500;
	int Capacity=4;

	@Override
	public void CPUBrand() {
		// TODO Auto-generated method stub
		System.out.print("CPU��Ʒ���ǣ�"+CPUBrand);
	}

	@Override
	public void Frequency() {
		// TODO Auto-generated method stub
		System.out.println("����Ƶ�ǣ�"+Frequency+"GHz");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Ӳ�������ǣ�"+size+"GB");
	}

	@Override
	public void Capacity() {
		// TODO Auto-generated method stub
		System.out.println("�ڴ������ǣ�"+Capacity+"GB");
	}
	public void showInfo(){
		System.out.println("���������Ϣ���£�");
	}

}
