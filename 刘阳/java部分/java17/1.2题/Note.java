
public class Note extends TraditionPhone implements AddFunction {

	@Override
	public void music() {
		
	}

	@Override
	public void video() {
		System.out.println("开始播放视频《小时代》......");
	}

	@Override
	public void photo() {
		System.out.println("咔嚓......拍照成功");
		System.out.println("发送带图片与文字的信息......");
	}

	@Override
	public void internat() {
		System.out.println("已经启动移动网络......");
		
	}

	@Override
	public void tp() {
		System.out.println("开始视频通话......");
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}
	
}
