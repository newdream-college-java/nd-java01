package cn.song.entity;
/**
* @author mo
* @version 2019年5月27日 下午3:06:25
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
