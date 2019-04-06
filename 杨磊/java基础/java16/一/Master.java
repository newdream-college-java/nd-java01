package com.nd.zuoye.yl.yi;

public class Master {
	public void feed(Pet pet){
		System.out.println("主人正在喂食");
		pet.eat();
	}
	public void play(Pet pet){
		pet.bPlay();
	}
}
