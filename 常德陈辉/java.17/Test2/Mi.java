package Test2;

public class Mi implements Movie, Internet, Note,Photo,Phone {

	@Override
	public void movue() {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频《小时代》。。。。。。");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("已启动移动网络。。。。。。");
	}

	@Override
	public void note() {
		// TODO Auto-generated method stub
		System.out.println("发送带图片与文字的信息。。。。。。");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("咔嚓。。。。。。。拍照成功");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话。。。。。");
	}
	public void sj(){
		System.out.println("这是一款型号为红米Note的小米手机：");
	}
}
