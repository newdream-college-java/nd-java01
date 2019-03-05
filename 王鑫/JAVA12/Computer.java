package Test2019_3_5_z12;

import java.util.Random;

public class Computer {
	String name;
	int jf = 0;
	public int showFist(){
		Random ran = new Random();
		int n = ran.nextInt(3)+1;
		return n;
	} 
	
}
