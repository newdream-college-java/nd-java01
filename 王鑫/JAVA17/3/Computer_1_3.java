package Test2019_3_14_z17;


public class Computer_1_3 {
		CPU_1_3 cpu = new InterCPU_1_3();
		EMS_1_3 ems = new JSD_EMS_1_3();
		HardDisk_1_3 hardDisk = new XJ_HardDisk_1_3();
		
		public Computer_1_3(String cpu,int ems,int disk) {
			
		}
		
		public void showInfo(){
			System.out.println("���������Ϣ���£�");
			System.out.println("CPU��Ʒ���ǣ�"+cpu.getCPUBrand()+",��Ƶ�ǣ�"+cpu.getFrequency()+"GHZ");
			System.out.println("Ӳ�������ǣ�"+hardDisk.getCapacity()+"GB");
			System.out.println("�ڴ������ǣ�"+ems.getSize()+"GB");
		}
}
