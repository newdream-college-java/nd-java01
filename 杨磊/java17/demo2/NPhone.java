package com.nd.yl.demo2;

public class NPhone extends Phone implements New {

	public NPhone() {
		super("小米", "红米Note");
	}

	public void message() {
		System.out.println("正在发送文字信息》》》");

	}

	public void phone() {
		System.out.println("正在语言通话》》》");

	}

	public void music() {
		System.out.println("正在播放音乐啦啦啦啦德玛西亚》》》");

	}

	public void mp4() {
		System.out.println("正在放映视频复仇者联盟9》》》");

	}

	public void photo() {
		System.out.println("正在柔光拍照，双摄双拍，招出你的丑》》》");

	}

	public void surf() {
		System.out.println("正在上网冲浪，浏览小黄片--我们的天坑》》》");

	}

	public void print() {
		System.out.println("这是一款型号为" + getType() + "的" + getBrand() + "手机");
		System.out.println("已连接移动网络----》");

	}

}
