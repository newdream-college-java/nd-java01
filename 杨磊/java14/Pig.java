package com.nd.zuoye.yl;

public class Pig extends Pet{
	private String pimao = "°×É«";
	
	
	
	
	public Pig(String name, String maopi) {
		super(name);
		this.pimao  = maopi;
	}
	public String getPimao() {
		return pimao;
	}
	public void setPimao(String pimao) {
		this.pimao = pimao;
	}
	public void print() {
		System.out.println(getName()+getHealth()+getLove()+pimao);
		
	}
	
	
	
}
