package ��17�½ӿڵ���1_3��ҵ;

public class Test {
	public static void main(String[] args) {
		//System.out.println("�������Ϣ���£�");
		IntelCPU cpu1=new IntelCPU();
		//System.out.println("CPU��Ʒ���ǣ�"+cpu1.getCPUBrand()+",��Ƶ��:"+cpu1.getFrequency()+"HZ");
		XJ_HardDisk xjHDisk = new XJ_HardDisk();
		//System.out.println("Ӳ���ڴ���:"+xjHDisk.getCapacity()+"GB");
		JSD_EMS jsdEms=new JSD_EMS();
		//System.out.println("�ڴ������ǣ�"+jsdEms.getSize());
		Computer com1=new Computer(cpu1.getCPUBrand(),cpu1.getFrequency(),xjHDisk.getCapacity(), jsdEms.getSize());
		com1.show();
	}
}
