package exercise6;
/**
 * ���嶯��Animal�ӿڣ����巽��shout()��ʾ�������
 * ���幷��Dog,����è��Cat���ֱ�ʵ��Animal�ӿ�
 * �����̵���Store����ƾ�̬���������ݿͻ���������ͷ��ض������
 * ��д�����࣬ͨ��Store��ľ�̬����get����һֻ�������������
 * ��չ�������w
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Animal animal=Store.getPet("��");
		animal.shout();
		Animal animal1=Store.getPet("pig");
		animal1.shout();
	}
}
