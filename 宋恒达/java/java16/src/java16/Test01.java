package java16;
/**
 * ������ιʳ���佡��ֵ����3������Ա���Ϣ��
 * �����ιʳ���佡��ֵ����5������Ա���Ϣ��
 * ��è��ιʳ���佡��ֵ����4������Ա���Ϣ��
 * @author mo
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Master m=new Master();
		Pet dog=new Dog();
		dog.setName("ŷŷ");
		m.feed(dog);
		Pet penguin=new Penguin();
		penguin.setName("��");
		m.feed(penguin);
		Pet cat=new Cat();
		cat.setName("��ķ");
		m.feed(cat);
	}
}
