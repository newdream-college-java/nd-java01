
public class TestStarSMS {

	public static void main(String[] args) {
		StarSMS sm01=new StarSMS();
		StarSMS sm02=new StarSMS();
		sm01.name="abcd";
		sm01.code="1234";
		sm02.name="newdream";
		sm02.code="1234";
		sm01.showLoginMenu();
		sm02.showLoginMenu();
	}

}
