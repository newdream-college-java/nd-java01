package Test2019_3_6_z13;

public class Person {
	String[] name = { "����", "����" };
	String[] sex = { "��", "��" };
	int[] age = { 18, 20 };

	public void Person() {
		System.out.println("---------------------��Ա��Ϣ---------------------");
		System.out.println("��Ա��Ϣ���£�");
		for (int i = 0; i < name.length; i++) {
			System.out.println("����-->" + name[i]);
			System.out.println("�Ա�-->" + sex[i]);
			System.out.println("����-->" + age[i] + "\n");
		}
	}
}
