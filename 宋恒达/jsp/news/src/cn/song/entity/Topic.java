package cn.song.entity;
/**
* @author mo
* @version 2019��5��27�� ����3:06:25
* @description
*/
public class Topic {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Topic [title=" + title + "]";
	}
	
}
