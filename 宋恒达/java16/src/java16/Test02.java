package java16;
/**
 * ���˺͹�����ӷ��̣��佡��ֵ����10�����ܶ�����5�������ˣ��Ϣ
 * ���κ��������Ӿ���佡��ֵ����19�����ܶ�����5
 * @author mo
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Master m=new Master();
		Pet dog=new Dog();
		dog.setName("ŷŷ");
		Pet penguin=new Penguin();
		penguin.setName("��");
		m.playWithPet(dog);
		m.playWithPet(penguin);
	}
}
