package com.nd.yl.demo3;

public class Computer {
	CPU cpu;
	EMS ems;
	HardDisk harddisk;

	public Computer() {

	}

	public Computer(CPU cpu, EMS ems, HardDisk harddisk) {
		this.cpu = cpu;
		this.ems = ems;
		this.harddisk = harddisk;
	}

	public void showInfo() {
		System.out.println("这台电脑的配置为：");
		System.out.println("\t\tCpu " + cpu.CPUBrand() + " 尺寸 "
				+ cpu.Frequency());
		System.out.println("\t\t内存 " + ems.getSize() + "Gb ");
		System.out.println("\t\t硬盘 " + harddisk.getCapacity() + "T");

	}
}
