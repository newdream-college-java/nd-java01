package ��ҵ;

public class Computer {
	CPU cpu;
	YP yp;
	NC nc;
	public Computer(CPU cpu,YP yp,NC nc){
		this.cpu=cpu;
		this.yp=yp;
		this.nc=nc;
	
	}
	
	public  void showInfo() {
		System.out.println("��̨�����������Ϊ\nƷ��Ϊ��"+cpu.brand()+"\t��ƵΪ��"+cpu.frequency()+"GHz\nӲ������Ϊ��"+yp.size()+"GB\n�ڴ�����"+nc.capacity()+"GB");
	}
}
