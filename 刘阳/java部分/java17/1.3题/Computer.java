
public class Computer {
	CPU cpu;
	EMS ems;
	HardDisk hardDisk;
	public Computer (CPU cpu,EMS ems,HardDisk hardDisk) {
		this.cpu=cpu;
		this.ems=ems;
		this.hardDisk=hardDisk;
	}
	public  void showInfo(){
		System.out.println("CPU��Ʒ���ǣ�"+cpu.getCPUBrand()+",��Ƶ�ǣ�"+cpu.getFrequency()+"Hz");
		System.out.println("Ӳ�������ǣ�"+hardDisk.getCapacity()+"GB");
		System.out.println("�ڴ������ǣ�"+ems.getSize()+"GB");
		}
	
}
