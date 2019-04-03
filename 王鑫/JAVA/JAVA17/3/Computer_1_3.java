package Test2019_3_14_z17;


public class Computer_1_3 {
		CPU_1_3 cpu = new InterCPU_1_3();
		EMS_1_3 ems = new JSD_EMS_1_3();
		HardDisk_1_3 hardDisk = new XJ_HardDisk_1_3();
		
		public Computer_1_3(String cpu,int ems,int disk) {
			
		}
		
		public void showInfo(){
			System.out.println("计算机的信息如下：");
			System.out.println("CPU的品牌是："+cpu.getCPUBrand()+",主频是："+cpu.getFrequency()+"GHZ");
			System.out.println("硬盘容量是："+hardDisk.getCapacity()+"GB");
			System.out.println("内存容量是："+ems.getSize()+"GB");
		}
}
