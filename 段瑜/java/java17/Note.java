package 作业;

public class Note extends Cellphone implements Broadcast, Shooting, Internet{

	@Override
	public void sending() {
		// TODO Auto-generated method stub
		System.out.println("发送带图片与文字的信息......");
	}

	@Override
	public void Dialing() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话......");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		setType("红米Note");
		System.out.println("这是一款信号为"+getType()+"的小米手机");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("已开启移动网络");
	}

	@Override
	public void shooting() {
		// TODO Auto-generated method stub
		System.out.println("咔嚓......拍照成功");
	}

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频《小时代》.....");
	}

}
