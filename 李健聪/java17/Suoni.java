package 作业;

public class Suoni implements PlayMusic,SendText,Converse {
	public void zishu(){
		System.out.println("这是一款型号为G502c的索尼爱立信手机");
	}
	public void sendtext(){
		System.out.println("发送文字信息");
	}

	@Override
	public void converse() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话。。。。。");
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
	System.out.println("播放音乐《热血》。。。。");	
	}
}
