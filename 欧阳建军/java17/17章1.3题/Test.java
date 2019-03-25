package 第17章接口电脑1_3作业;

public class Test {
	public static void main(String[] args) {
		//System.out.println("计算机信息如下：");
		IntelCPU cpu1=new IntelCPU();
		//System.out.println("CPU的品牌是："+cpu1.getCPUBrand()+",主频是:"+cpu1.getFrequency()+"HZ");
		XJ_HardDisk xjHDisk = new XJ_HardDisk();
		//System.out.println("硬盘内存是:"+xjHDisk.getCapacity()+"GB");
		JSD_EMS jsdEms=new JSD_EMS();
		//System.out.println("内存容量是："+jsdEms.getSize());
		Computer com1=new Computer(cpu1.getCPUBrand(),cpu1.getFrequency(),xjHDisk.getCapacity(), jsdEms.getSize());
		com1.show();
	}
}
