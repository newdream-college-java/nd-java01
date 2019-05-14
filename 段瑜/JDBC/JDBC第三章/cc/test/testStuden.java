package cn.cc.test;

import java.util.Scanner;

import cn.cc.entity.Studen;
import cn.cc.manager.StudenManager;

public class testStuden {
	public static void main(String[] args) {
		Studen studen=new Studen();
		StudenManager s=new StudenManager();
		s.update(studen);
		System.out.println(s.select(studen));
		
	}
}
