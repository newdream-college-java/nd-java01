package exercise2;

public class NewPhoneImpl extends Phone implements NewPhone{

	@Override
	public void playMusic(String name) {
		// TODO Auto-generated method stub
		System.out.println("正在播放音乐《"+name+"》");
	}

	@Override
	public void playVideo(String name) {
		// TODO Auto-generated method stub
		System.out.println("正在播放视频"+name);
	}

	@Override
	public void playPhoto() {
		// TODO Auto-generated method stub
		System.out.println("正在拍照");
	}

	@Override
	public void playWifi() {
		// TODO Auto-generated method stub
		System.out.println("正在上网");
	}

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("正在语音通话");
	}

	@Override
	public void SetWord() {
		// TODO Auto-generated method stub
		System.out.println("正在发送文字");
	}

	@Override
	public void setImage() {
		// TODO Auto-generated method stub
		System.out.println("发送带图片的文字消息");
	}

}
