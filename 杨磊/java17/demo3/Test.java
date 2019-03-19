package com.nd.yl.demo3;

public class Test {

	public static void main(String[] args) {
		CPU c = new IntelCPU();
		EMS e = new JSD_EMS();
		HardDisk h = new XJ_HardDisk();
		Computer com = new Computer(c, e, h);
		com.showInfo();

	}

}
