package com.song;

public class Test {
		public static void main(String[] args) {
			//人的对象
//			Person p=new Person();
//			System.out.println(p.punch());
//			Computer c=new Computer();
//			c.punch();
			Game game=new Game();
			game.initial();
			game.startGame();
			game.showResult();
			
		}
}
