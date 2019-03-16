package 作业;

public class G502c extends Cellphone implements Broadcast, Shooting, Internet {

	@Override
	public void internet() {
		System.out.println("已开启移动网络");

	}

	@Override
	public void shooting() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐《热血》.....");
	}

	@Override
	public void sending() {
		// TODO Auto-generated method stub
		System.out.println("发送文字信息。。。。");
	}

	@Override
	public void Dialing() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		setType("G502c");
		System.out.println("这是一款型号为"+getType()+"的索尼爱立信手机");
	}

	

}
