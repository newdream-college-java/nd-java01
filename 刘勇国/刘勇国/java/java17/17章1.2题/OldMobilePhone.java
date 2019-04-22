package 第17章接口手机1_2作业;

public class OldMobilePhone extends MobilePhone implements CallSomeone,PlayMusic,SendMessage{

	public OldMobilePhone(String type) {
		setType(type);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("这是一款"+getType());
		
	}

	@Override
	public void callSomeone() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话........");
		
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐《热雪》........");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("开始发送文字信息........");
	}

}
