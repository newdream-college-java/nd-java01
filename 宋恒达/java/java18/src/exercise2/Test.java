package exercise2;
/**
 * �������Person,�����������䡢�Ա�����˽�����ԣ���װΪֻд
 * �������Person���print�����������ʽ������������Ա����䣩
 * �Ա��set����������Ա�ֻ���л���Ů�������׳��쳣��Ϣ���Ա�������л���
 * Ů�������set�����������ֻ��1-100�꣬�����׳��쳣��Ϣ���������
 * ��1��100֮��
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		try {
			Person p=new Person();
			p.setName("����");
			p.setAge(10);
			p.setSex("��");
			p.print();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
