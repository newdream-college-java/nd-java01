package com.java.java18.Z6;

import org.apache.log4j.Logger;


public class Z6 {
	static Logger log =Logger.getLogger(Z6.class);
	public static void main(String[] args) {
		int[] arr=new int[5];
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			log.debug("数组下标越界");
		}


	}

}
