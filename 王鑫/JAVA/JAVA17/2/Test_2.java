package Test2019_3_14_z17;

public class Test_2 {
	public static void main(String[] args) {
		//���ֻ��ͺ�
		Phone_2 mp = new mobilePhone_2();
		mp.xh("G502c�����ᰮ����");
		mp.yy("��ѩ");
		//���ֻ�����������
		mobilePhone_2_1 mp2 = new mobilePhone_2_1();
		mp2.xx();
		mp2.th();
		
		System.out.println();
		
		//���ֻ��ͺ�
		Phone_2 np = new NewPhone_2();
		np.xh("����Note��С��");
		//���ֻ���������
		NewPhone_2_1 np2= new NewPhone_2_1();
		np2.shuju();
		np2.shiPin("Сʱ��");
		np2.paiZhao();
		np2.xx();
		np2.th();
	}
}
