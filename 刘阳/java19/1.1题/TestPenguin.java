import java.awt.List;
import java.util.ArrayList;


public class TestPenguin {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new Penguin("ŷŷ","Q��"));
		list.add(new Penguin("����","Q��"));
		list.add(new Penguin("�Ʒ�","Q��"));
		list.add(new Penguin("����","Q��"));
		
		System.out.println("������"+list.size()+"ֻ���");
		System.out.println("�ֱ��ǣ�");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		list.remove(new Penguin("�Ʒ�","Q��"));
		list.remove(new Penguin("����","Q��"));
		System.out.println("ɾ��֮����"+list.size()+"ֻ���");
		System.out.println("�ֱ��ǣ�");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			
			if(((Penguin)list.get(i)).getName().equals("����")){
				flag=true;
				System.out.println("�ҵ�����������Ϣ��");
			}
		}
		if(!flag){
			System.out.println("û���ҵ���������Ϣ��");
		}
	}

}
