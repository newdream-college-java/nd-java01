
public class Test implements Utility,Constanal {

	public static void main(String[] args) {
		//����new Constanal�ǲ��Եģ���Ϊֻ���ø��ӿ�����ָ����������
		Constanal con=new Test();
		System.out.println(con.MAX);
		int i=50;
		if(i>con.MAX){
			//Ӧ�ð�Constanal.MAX��MAX���ڸ��ӿڵľ�̬��������ֵ�Ժ���޷������ˣ��������ﱨ��
			con.MAX=i;
		}
	}

}
