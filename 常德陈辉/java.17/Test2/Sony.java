package Test2;

public class Sony implements Music,Note,Phone{

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐《热血》。。。。。。");
	}

	@Override
	public void note() {
		// TODO Auto-generated method stub
		System.out.println("发送文字信息。。。。。。");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话。。。。。。");
	}
	public void sj(){
		System.out.println("这是一款型号为G502c的索尼爱立信手机：");
	}
	
}
