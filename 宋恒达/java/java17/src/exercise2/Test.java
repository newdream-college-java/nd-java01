package exercise2;

public class Test {
	public static void main(String[] args) {
		NewPhone sony=new NewPhoneImpl();
		if(sony instanceof NewPhoneImpl) {
			((NewPhoneImpl)sony).setBrand("索尼");
			((NewPhoneImpl)sony).setType("G502");
			((NewPhoneImpl)sony).print();
		}
		sony.playMusic("热雪");
		sony.Call();
		sony.SetWord();
		System.out.println();
		NewPhone xiaomi=new NewPhoneImpl();
		if(xiaomi instanceof NewPhoneImpl) {
			((NewPhoneImpl)xiaomi).setBrand("小米");
			((NewPhoneImpl)xiaomi).setType("红米Note");
			((NewPhoneImpl)xiaomi).print();
		}
		xiaomi.playWifi();
		xiaomi.playVideo("小时代");
		xiaomi.playPhoto();
		xiaomi.setImage();
		
	}
}
