package exercise3;
/**
 * 使用接口描述组装一台电脑的过程，采用面向对象编程思想组装一台计算机
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		CPU cpu = new IntelCPU();
		EMS ems = new JSD_EMS();
		HardDisk hardDisk = new XJ_HardDisk();
		Computer computer = new Computer(cpu, ems, hardDisk);
		computer.showInfo();
	}
}
