package exercise3;
/**
 * ʹ�ýӿ�������װһ̨���ԵĹ��̣��������������˼����װһ̨�����
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
