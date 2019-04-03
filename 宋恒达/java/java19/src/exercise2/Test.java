package exercise2;

import exercise1.Penguin;
/**
 * 创建一个类Queue，代表队列（其特点为先进先出）添加方法add(Object obj)
 * 以及方法Object get(),并在main()方法中进行效果验证
 * 提示：使用LinkedList实现队列：在向其添加时，使用addFirst(),在从中
 * 取出数据时，使用removerLast方法
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.add(1);
		queue.add("队列");
		queue.add(new Penguin("欧欧", "Q仔"));
		int size=queue.size();
		for(int i=0;i<size;i++) {
			System.out.println(queue.get());
		}
	}
}
