package 第17章接口手机1_2作业;

public class ModernPhone extends MobilePhone implements PlayMusic,SendMessage,CallSomeone,Vedio,TakePhotoes,MobileInternet{
	
	public ModernPhone(String type){
		setType(type);
	}
	@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("这是一款"+getType());
			
		}
	

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("不想放歌了.....");
		
		
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("发送带图片与文字的信息");
		
	}

	@Override
	public void callSomeone() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话");
	}

	@Override
	public void Vedio() {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频《小时代》");
	}

	@Override
	public void takePhotoes() {
		// TODO Auto-generated method stub
		System.out.println("咔嚓......拍照成功");
		
	}


	@Override
	public void startInternet() {
		// TODO Auto-generated method stub
		System.out.println("已经启动移动网络.....");
	}
	
}
