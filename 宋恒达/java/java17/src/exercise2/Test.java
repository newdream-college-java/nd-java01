package exercise2;

public class Test {
	public static void main(String[] args) {
		NewPhone sony=new NewPhoneImpl();
		if(sony instanceof NewPhoneImpl) {
			((NewPhoneImpl)sony).setBrand("����");
			((NewPhoneImpl)sony).setType("G502");
			((NewPhoneImpl)sony).print();
		}
		sony.playMusic("��ѩ");
		sony.Call();
		sony.SetWord();
		System.out.println();
		NewPhone xiaomi=new NewPhoneImpl();
		if(xiaomi instanceof NewPhoneImpl) {
			((NewPhoneImpl)xiaomi).setBrand("С��");
			((NewPhoneImpl)xiaomi).setType("����Note");
			((NewPhoneImpl)xiaomi).print();
		}
		xiaomi.playWifi();
		xiaomi.playVideo("Сʱ��");
		xiaomi.playPhoto();
		xiaomi.setImage();
		
	}
}
