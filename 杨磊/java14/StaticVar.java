package com.nd.zuoye.yl;

public class StaticVar {
	static {
		System.out.println("Class4Load loaded...");
	}
	
	public static String VAR = "VAR_In_LOAD";
	//≥£Ã¨±‰¡ø
	public static final String FIANL_VAR = "FIANL_VAR_In_LOAD";
}
