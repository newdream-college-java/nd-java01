package Test2019_3_18_z19;

import java.util.LinkedList;

public class Queue_2 {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("1");
		link.add("2");
		link.add("3");
		link.add("4");
		link.add("5");
		link.addFirst("0");
		System.out.println("使用addFrist后的link队列：");
		for (int i = 0; i < link.size(); i++) {
			System.out.print(link.set(i,0)+" ");
		}
		link.removeFirst();
		System.out.println("\n使用removeFirst后的link队列：");
		for (int i = 0; i < link.size(); i++) {
			System.out.print(link.set(i,5)+" ");
		}
	}
}
