
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager a=new Manager();
		a.t=1;
		for (int i = 0; i < a.t; i++) {	
			System.out.println("����Ա��Ϣ�û���Ϊ��"+a.showName(i)+"\t����Ϊ��"+a.showMm(i));
		}
	}

}
