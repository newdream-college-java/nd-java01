package com.java.java17.Z3;

public class Test {
	public static void main(String[] args) {
		Cpu cpu=new IntelCpu(); 
		Ems ems=new JsdEms();
		HardDIsk hd=new XjHardDIsk();
		Computer cm=new Computer(cpu, ems, hd);
		cm.showInfo();

	}

}
