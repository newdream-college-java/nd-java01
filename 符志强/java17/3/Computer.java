package 作业;

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
		System.out.println("这台计算机的数据为\n品牌为："+cpu.brand()+"\t主频为："+cpu.frequency()+"GHz\n硬盘容量为："+yp.size()+"GB\n内存容量"+nc.capacity()+"GB");
	}
}
