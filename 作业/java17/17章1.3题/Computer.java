package ��17�½ӿڵ���1_3��ҵ;

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
		System.out.println("�������Ϣ���£�");
		IntelCPU cpu1=new IntelCPU();
		System.out.println("CPU��Ʒ���ǣ�"+cpu+",��Ƶ��:"+hz+"HZ");
		System.out.println("Ӳ���ڴ���:"+ems+"GB");
		System.out.println("�ڴ������ǣ�"+hardDisk+"GB");
	}
	
}
