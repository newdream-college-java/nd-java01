
public class Test01 {
	public static void main(String[] args) {
		AddFunction phone=new Sony();
		System.out.println("����һ���ͺ�ΪG502c�����ᰮ�����ֻ���");
		phone.music();
		TraditionPhone phone1=new Sony();
		phone1.message();
		phone1.tp();
		System.out.println("����һ���ͺ�Ϊ����NOTE��С���ֻ���");
		AddFunction note=new Note();
		TraditionPhone note1=new Note();
		note.internat();
		note.video();
		note.photo();
		note1.tp();
	}
}
