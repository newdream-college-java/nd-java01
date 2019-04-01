package java19;



import java.util.*;
public class Wu {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("r");
		list.add("y");
		list.add("w");
		print(list);

	}
	public static void print(List pList){
		for(int i=0;i<pList.size();i++){
			String str=(String) pList.get(i);
			System.out.print(str);
		}
	}
}