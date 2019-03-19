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
		System.out.println("��̨���Ե�����Ϊ��");
		System.out.println("\t\tCpu " + cpu.CPUBrand() + " �ߴ� "
				+ cpu.Frequency());
		System.out.println("\t\t�ڴ� " + ems.getSize() + "Gb ");
		System.out.println("\t\tӲ�� " + harddisk.getCapacity() + "T");

	}
}
