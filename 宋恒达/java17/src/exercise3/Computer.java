package exercise3;

public class Computer {
	private CPU cpu;
	private EMS ems;
	private HardDisk hardDisk;
	public Computer(CPU cpu,EMS ems,HardDisk hardDisk) {
		this.cpu=cpu;
		this.ems=ems;
		this.hardDisk=hardDisk;
	}
	public void showInfo() {
		System.out.println("���������Ϣ���£�");
		System.out.println("CPU��Ʒ���ǣ�"+cpu.getCPUBrand()+",��Ƶ��:"+cpu.getFrequency()+"GHz");
		System.out.println("Ӳ�������ǣ�"+ems.getSize()+"GB");
		System.out.println("�ڴ�������:"+hardDisk.getCapacity()+"GB");
	}
}
