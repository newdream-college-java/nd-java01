package exercise2;

import exercise1.Penguin;
/**
 * ����һ����Queue��������У����ص�Ϊ�Ƚ��ȳ�����ӷ���add(Object obj)
 * �Լ�����Object get(),����main()�����н���Ч����֤
 * ��ʾ��ʹ��LinkedListʵ�ֶ��У����������ʱ��ʹ��addFirst(),�ڴ���
 * ȡ������ʱ��ʹ��removerLast����
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.add(1);
		queue.add("����");
		queue.add(new Penguin("ŷŷ", "Q��"));
		int size=queue.size();
		for(int i=0;i<size;i++) {
			System.out.println(queue.get());
		}
	}
}
