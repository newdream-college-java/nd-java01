package com.song;

/**
 * 编写管理员Manager，使用show()方法返回 管理员信息（使用return语句实现信息的返回）
 * 
 * @author mo
 *
 */
public class Manager {
	String name;
	String password;

	public String show() {
		return "管理员信息用户名为:" + name + "\t密码为:" + password;
	}
}
