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
		System.out.println("计算机的信息如下：\nCPU的品牌是："+cpu.getCPUBran()+"，主频是："+cpu.getFrequency()+"GHZ\n硬盘容量是："+ems.getSize()+"GB\n内存容量是："+harddisk.getCapacity()+"GB");
		
	}
}
