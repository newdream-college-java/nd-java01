package 作业;

public class SmartPhone implements Gointernet,PlayMusic,TakePhoto,SendText,Converse {

	
	public void nb(){
		System.out.println("这是一款型号为红米Note的小米手机");
	}
	public void converse() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话。。。。");
	}

	@Override
	public void sendtext() {
		// TODO Auto-generated method stub
		System.out.println("发送带图片与文字的信息。。。。");
	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		System.out.println("咔擦。。。。。拍照成功");
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频《小时代》。。。。");
	}

	@Override
	public void gointernet() {
		// TODO Auto-generated method stub
		System.out.println("已经启动移动网络");
	}
	
}
