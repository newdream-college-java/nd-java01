package com.java.java17.Z3;

public class Computer {
	Cpu cpu;
	Ems ems;
	HardDIsk harddisk;
	public Computer(Cpu cpu,Ems ems,HardDIsk harddisk){
		this.cpu=cpu;
		this.ems=ems;
		this.harddisk=harddisk;
	}
	
	
	public void showInfo(){
		System.out.println("���������Ϣ���£�\nCPU��Ʒ���ǣ�"+cpu.getCPUBran()+"����Ƶ�ǣ�"+cpu.getFrequency()+"GHZ\nӲ�������ǣ�"+ems.getSize()+"GB\n�ڴ������ǣ�"+harddisk.getCapacity()+"GB");
		
	}
}
