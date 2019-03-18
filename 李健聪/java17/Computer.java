package 作业;

public class Computer implements Cpu,YpAndNc {
	public void cpu(){
		System.out.println("CPU的品牌是：Intel，主频是：3.8GHz");
	}
	public void ypnc(){
		System.out.println("硬盘容量是：500GB\n内存容量是：4GB");
	}
}
