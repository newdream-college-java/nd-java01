import java.awt.List;
import java.util.ArrayList;


public class TestPenguin {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new Penguin("欧欧","Q仔"));
		list.add(new Penguin("亚亚","Q妹"));
		list.add(new Penguin("菲菲","Q妹"));
		list.add(new Penguin("美美","Q妹"));
		
		System.out.println("共计有"+list.size()+"只企鹅");
		System.out.println("分别是：");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		list.remove(new Penguin("菲菲","Q妹"));
		list.remove(new Penguin("美美","Q妹"));
		System.out.println("删除之后还有"+list.size()+"只企鹅");
		System.out.println("分别是：");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			
			if(((Penguin)list.get(i)).getName().equals("美美")){
				flag=true;
				System.out.println("找到了美美的信息！");
			}
		}
		if(!flag){
			System.out.println("没有找到美美的信息！");
		}
	}

}
