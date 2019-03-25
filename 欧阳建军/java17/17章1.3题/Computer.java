package 第17章接口电脑1_3作业;

public class Computer {
	private String cpu;
	private Float hz;
	private int ems;
	private int hardDisk;
	public Computer(String cpu,Float hz,int ems,int hardDisk){
		this.cpu=cpu;
		this.ems=ems;
		this.hardDisk=hardDisk;
		this.hz=hz;
	}
	public void show(){
		System.out.println("计算机信息如下：");
		IntelCPU cpu1=new IntelCPU();
		System.out.println("CPU的品牌是："+cpu+",主频是:"+hz+"HZ");
		System.out.println("硬盘内存是:"+ems+"GB");
		System.out.println("内存容量是："+hardDisk+"GB");
	}
	
}
