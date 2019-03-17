package 作业;

public class Zilei extends Fulei implements Yingping,Shiping,Paizhao,Tongxun,Duanxin {
	public void name() {
		System.out.println("这是一款型号为G502c的索尼爱立信手机");
	}

	public void sp() {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频《小时代》");
	}
	@Override
	public void yp() {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐《热雪》");
	}
	public void dx() {
		// TODO Auto-generated method stub
		System.out.println("发送文字信息");
	}
	@Override
	public void tx() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话");
	}
	@Override
	public void pz() {
		// TODO Auto-generated method stub
		System.out.println("咔嚓----拍照成功");
	}
	public void sw() {
		System.out.println("开始启动移动网络");
	}
}
